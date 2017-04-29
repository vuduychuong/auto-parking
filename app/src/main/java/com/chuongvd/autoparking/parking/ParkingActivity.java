package com.chuongvd.autoparking.parking;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.chuongvd.autoparking.R;
import com.chuongvd.autoparking.databinding.ActivityParkingBinding;

public class ParkingActivity extends AppCompatActivity implements ParkingContract.View {

    ActivityParkingBinding mBinding;
    ParkingPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_parking);
        mPresenter = new ParkingPresenter(this);
        mBinding.setPresenter(mPresenter);
    }

    @Override
    public void setPresenter(ParkingContract.Presenter presenter) {

    }
}
