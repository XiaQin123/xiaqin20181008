package com.bwie.xiaqin.xiaqin20181008;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import java.util.List;

/**
 * Created by lenovo on 2018/10/8.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private List<View> list;
    final int PAGE_COUNT = 3;
    private Context context;
    private String[] tabTitles = {"首页","分类","我的"};


    public MyPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment();
            case 1:
                return new Fragment();
            case 2:
                return new Fragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
