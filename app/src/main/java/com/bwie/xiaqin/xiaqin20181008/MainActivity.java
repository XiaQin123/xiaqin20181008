package com.bwie.xiaqin.xiaqin20181008;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private WaseView wv;
    private ImageView image_view;
    private ViewPager viewPager;
    private TableLayout tableLayout;
    private MyPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), this);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(pagerAdapter);
        tableLayout = findViewById(R.id.tab_layout);
        

        wv = findViewById(R.id.wv);
        image_view = findViewById(R.id.image_view);

        WaseView.OnWaseChangeListener listener = new WaseView.OnWaseChangeListener(){

            @Override
            public void onChanged(float y) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) image_view.getLayoutParams();
                layoutParams.setMargins(0,0,0, (int) y);
                image_view.setLayoutParams(layoutParams);
            }
        };
        wv.setOnWaseChangeListener(listener);
        //调用onMeasure和onLayout方法
        //wv.requestLayout();
    }
}
