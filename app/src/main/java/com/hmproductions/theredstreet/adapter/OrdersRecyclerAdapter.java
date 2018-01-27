package com.hmproductions.theredstreet.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.hmproductions.theredstreet.R;
import com.hmproductions.theredstreet.data.Order;
import com.hmproductions.theredstreet.utils.Constants;
import com.hmproductions.theredstreet.utils.StockUtils;

import java.util.Collections;
import java.util.List;

public class OrdersRecyclerAdapter extends RecyclerView.Adapter<OrdersRecyclerAdapter.MyViewHolder> {

    private Context context;
    private List<Order> orderList;
    private OnOrderClickListener listener;

    public interface OnOrderClickListener {
        void onOrderClick(int orderId, boolean bid);
    }

    public OrdersRecyclerAdapter(Context context, List<Order> orderList, OnOrderClickListener listener) {
        this.context = context;
        this.orderList = orderList;
        this.listener = listener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.order_list_item, parent, false);
        return new OrdersRecyclerAdapter.MyViewHolder(itemView);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Order order = orderList.get(orderList.size()-position-1);
        String tempString;

        tempString = (order.isBid()?"BID - ":"ASK - ") + StockUtils.getOrderTypeFromTypeId(order.getOrderType());
        holder.typeTextView.setText(tempString);

        if (holder.typeTextView.getText().toString().substring(0,3).equals("BID"))
            holder.typeTextView.setTextColor(ContextCompat.getColor(context, R.color.neon_green));
        else
            holder.typeTextView.setTextColor(ContextCompat.getColor(context, R.color.neon_blue));

        tempString = StockUtils.getCompanyNameFromStockId(order.getStockId());
        holder.companyNameTextView.setText(tempString);

        tempString = String.valueOf(order.getStockQuantityFulfilled()) + " / " + String.valueOf(order.getStockQuantity());
        holder.quantityTextView.setText(tempString);

        tempString = (order.getStockQuantityFulfilled()==0?"Placed ":order.getStockQuantity()==order.getStockQuantityFulfilled()?"Filled":"Partially Filled") + " at " +
                Constants.RUPEE_SYMBOL + " " + String.valueOf(order.getPrice() + "/stock");
        holder.priceTextView.setText(tempString);

        if(order.getStockQuantity()==order.getStockQuantityFulfilled())
            holder.cancelButton.setEnabled(false);

        holder.quantitySeekbar.setMax(order.getStockQuantity());
        holder.quantitySeekbar.setProgress(order.getStockQuantityFulfilled());

        //holder.quantitySeekbar.getProgressDrawable().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.neon_green), PorterDuff.Mode.SRC_IN));
        holder.quantitySeekbar.setOnTouchListener((view, motionEvent) -> true);
    }

    @Override
    public int getItemCount() {
        if (orderList == null || orderList.size() == 0) return 0;
        return orderList.size();
    }

    public void swapData(List<Order> list) {
        orderList = list;

        Collections.sort(orderList, (o1, o2) -> {
            if (o1.isBid() && !o2.isBid())
                return 1;
            else if (o2.isBid() && !o1.isBid())
                return -1;
            else
                return 0;
        });

        notifyDataSetChanged();
    }

    public void orderUpdate(int orderId, int quantityFilled, boolean closed) {
        for (Order currentOrder : orderList) {
            if (currentOrder.getOrderId() == orderId) {
                if (closed) {
                    orderList.remove(currentOrder);
                } else {
                    currentOrder.setStockQuantityFulfilled(quantityFilled);
                }
                notifyDataSetChanged();
            }
        }
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView typeTextView, priceTextView, quantityTextView, companyNameTextView;
        Button cancelButton;
        SeekBar quantitySeekbar;

        MyViewHolder(View view) {
            super(view);

            typeTextView= view.findViewById(R.id.orderType_textView);
            priceTextView= view.findViewById(R.id.orderPrice_textView);
            quantityTextView= view.findViewById(R.id.quantity_textView);
            companyNameTextView= view.findViewById(R.id.company_textView);
            cancelButton= view.findViewById(R.id.cancel_button);
            quantitySeekbar = view.findViewById(R.id.stockDisplay_seekBar);

            cancelButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onOrderClick(orderList.get(getAdapterPosition()).getOrderId(), orderList.get(getAdapterPosition()).isBid());
        }
    }
}