package com.chuongvd.autoparking.parking;

import com.chuongvd.autoparking.base.BasePresenter;
import com.chuongvd.autoparking.base.BaseView;

/**
 * Created by vuduychuong1994 on 4/16/17.
 */

public interface ParkingContract {

    interface Presenter extends BasePresenter {

    }

    interface View extends BaseView<Presenter> {
        
    }
}
