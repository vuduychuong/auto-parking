package com.chuongvd.autoparking.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.chuongvd.autoparking.R;
import com.chuongvd.autoparking.databinding.ActivityMainBinding;
import com.chuongvd.autoparking.parking.ParkingActivity;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    ActivityMainBinding mBinding;
    MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mPresenter = new MainPresenter(this, this);
        mBinding.setPresenter(mPresenter);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public void goPreviousScreen() {
        onBackPressed();
    }

    @Override
    public void goToParkingAssitScreen() {
        startActivity(new Intent(this, ParkingActivity.class));
    }
}
