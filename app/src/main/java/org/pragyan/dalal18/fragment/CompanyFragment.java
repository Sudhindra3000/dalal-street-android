package org.pragyan.dalal18.fragment;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pragyan.dalal18.R;
import org.pragyan.dalal18.adapter.CompanyRecyclerAdapter;
import org.pragyan.dalal18.data.GlobalStockDetails;
import org.pragyan.dalal18.data.CompanyDetails;
import org.pragyan.dalal18.ui.MainActivity;
import org.pragyan.dalal18.utils.Constants;

import java.util.ArrayList;
import java.util.Collections;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CompanyFragment extends Fragment {

    @BindView(R.id.portfolio_recyclerView)
    RecyclerView portfolioRecyclerView;

    private ArrayList<CompanyDetails> portfolioList = new ArrayList<>();
    private CompanyRecyclerAdapter adapter;

    public CompanyFragment() {
        // Required empty public constructor
    }

    private BroadcastReceiver refreshStockPricesReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (getActivity() != null && intent.getAction() != null &&
                    (intent.getAction().equalsIgnoreCase(Constants.REFRESH_STOCK_PRICES_ACTION) || intent.getAction().equalsIgnoreCase(Constants.REFRESH_STOCKS_EXCHANGE_ACTION))) {
                updateValues();
            }
        }
    };

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_companies, container, false);

        if (getActivity() != null)  getActivity().setTitle("Company Details");
        ButterKnife.bind(this, rootView);

        adapter = new CompanyRecyclerAdapter(getContext(), null);

        updateValues();

        portfolioRecyclerView.setAdapter(adapter);
        portfolioRecyclerView.setHasFixedSize(false);
        portfolioRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return rootView;
    }

    public void updateValues(){

        portfolioList.clear();

        for (GlobalStockDetails currentStockDetail : MainActivity.Companion.getGlobalStockDetails()) {
            portfolioList.add(new CompanyDetails(
                    currentStockDetail.getFullName(),
                    currentStockDetail.getShortName(),
                    currentStockDetail.getPrice(),
                    currentStockDetail.getPreviousDayClose())
            );
        }

        sortList(portfolioList);
        adapter.swapData(portfolioList);
    }

    private void sortList(ArrayList<CompanyDetails> list) {
        Collections.sort(list, (v1, v2) -> v1.getValue()>v2.getValue()?v1.getValue():v2.getValue());
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getContext() != null) {
            IntentFilter intentFilter = new IntentFilter(Constants.REFRESH_STOCKS_EXCHANGE_ACTION);
            intentFilter.addAction(Constants.REFRESH_STOCK_PRICES_ACTION);

            LocalBroadcastManager.getInstance(getContext()).registerReceiver(
                    refreshStockPricesReceiver, intentFilter
            );
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (getContext() != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(refreshStockPricesReceiver);
        }
    }
}