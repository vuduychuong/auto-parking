package com.chuongvd.autoparking.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chuongvd.autoparking.R;

/**
 * Created by vuduychuong1994 on 4/18/17.
 */

public class BindingUtils {

    @BindingAdapter(value = { "loadImage", "placeHolder", "cacheSource" }, requireAll = false)
    public static void loadImage(ImageView imageView, String url, Drawable placeHolder,
            boolean isCacheSource) {
//        if (TextUtils.isEmpty(url) && placeHolder == null) {
//            return;
//        }
        Glide.with(imageView.getContext())
                .load(R.raw.auto_parking)
                .diskCacheStrategy(
                        isCacheSource ? DiskCacheStrategy.SOURCE : DiskCacheStrategy.RESULT)
                .placeholder(placeHolder)
                .into(imageView);
    }
}
