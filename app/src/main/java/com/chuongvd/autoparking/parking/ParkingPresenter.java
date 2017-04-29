package com.chuongvd.autoparking.parking;

import android.content.Context;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.io.IOException;

/**
 * Created by vuduychuong1994 on 4/16/17.
 */

public class ParkingPresenter implements ParkingContract.Presenter {
    public ObservableField<String> imageUrl;
    public ObservableField<Drawable> image;

    private Context mContext;

    public ParkingPresenter(Context context) {
        mContext = context;
        imageUrl = new ObservableField<>();
        image = new ObservableField<>();
        try {
            image.set(Drawable.createFromStream(mContext.getResources().getAssets().open("auto_parking.gif"), null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {

    }
}
