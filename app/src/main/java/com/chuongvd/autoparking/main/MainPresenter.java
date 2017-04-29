package com.chuongvd.autoparking.main;

import android.content.Context;
import android.util.Log;

/**
 * Created by vuduychuong1994 on 4/16/17.
 */

public class MainPresenter implements MainContract.Presenter {

    Context mContext;
    MainContract.View mView;

    public MainPresenter(Context context, MainContract.View view) {
        mContext = context;
        mView = view;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void onClickOk() {
        Log.d("click", "ok");
        mView.goToParkingAssitScreen();
    }

    @Override
    public void onClickBack() {
        mView.goPreviousScreen();
    }
}
