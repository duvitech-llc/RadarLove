package com.duvitech.radarlove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RadarView mRadarView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadarView = (RadarView) findViewById(R.id.radarView);
        mRadarView.setShowCircles(true);

    }


    public void stopAnimation(View view) {
        if (mRadarView != null) mRadarView.stopAnimation();
    }

    public void startAniamtion(View view) {
        if (mRadarView != null) mRadarView.startAnimation();
    }

}
