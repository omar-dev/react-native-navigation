package com.reactnativenavigation.layouts;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public abstract class BaseLayout extends RelativeLayout implements Layout {

    public BaseLayout(AppCompatActivity activity) {
        super(activity);
        activity.getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }

    protected AppCompatActivity getActivity() {
        return (AppCompatActivity) getContext();
    }
}
