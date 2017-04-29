package com.chuongvd.autoparking.main;

import com.chuongvd.autoparking.base.BasePresenter;
import com.chuongvd.autoparking.base.BaseView;

/**
 * Created by vuduychuong1994 on 4/16/17.
 */

public interface MainContract {

    interface View extends BaseView<Presenter> {

        void goPreviousScreen();

        void goToParkingAssitScreen();
    }

    interface Presenter extends BasePresenter {
        void onClickOk();

        void onClickBack();
    }
}
