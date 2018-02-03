package com.hmproductions.theredstreet.loaders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import com.hmproductions.theredstreet.utils.ConnectionUtils;
import com.hmproductions.theredstreet.utils.Constants;

import dalalstreet.api.DalalActionServiceGrpc;
import dalalstreet.api.actions.GetCompanyProfileRequest;
import dalalstreet.api.actions.GetCompanyProfileResponse;

public class CompanyProfileLoader extends AsyncTaskLoader<GetCompanyProfileResponse> {

    private DalalActionServiceGrpc.DalalActionServiceBlockingStub actionServiceBlockingStub;
    private int stockId;

    public CompanyProfileLoader(@NonNull Context context, DalalActionServiceGrpc.DalalActionServiceBlockingStub stub, int stockId) {
        super(context);
        actionServiceBlockingStub = stub;
        this.stockId = stockId;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public GetCompanyProfileResponse loadInBackground() {
        if (ConnectionUtils.getConnectionInfo(getContext()) && ConnectionUtils.isReachableByTcp(Constants.HOST, Constants.PORT))
            return actionServiceBlockingStub.getCompanyProfile(
                    GetCompanyProfileRequest.newBuilder()
                            .setStockId(stockId)
                            .build()
            );
        else
            return null;
    }
}
