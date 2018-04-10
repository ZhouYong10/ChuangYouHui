package com.chuangyouclub.chuangyouhui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import java.util.ArrayList;
import java.util.List;

public class NavActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener, ViewPager.OnPageChangeListener {
    private String TAG = NavActivity.class.getSimpleName();

    private ViewPager viewPager;
    private BottomNavigationBar botNavBar;
    private int lastSelectedPage = 0;

    private List<Fragment> fragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        initView();
    }

    private void initView() {
        initBottomNavigationBar();
        initViewPager();
    }

    private void initBottomNavigationBar() {
        botNavBar = findViewById(R.id.bottom_navigation_bar);
        // 导航栏基础设置，包括选中按钮效果，导航栏背景色等
        botNavBar.setTabSelectedListener(this)
                .setMode(BottomNavigationBar.MODE_FIXED)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                .setActiveColor("#46C01B")
                .setInActiveColor("#9B9B9B")
                .setBarBackgroundColor("#FCFCFC");

        // 添加导航栏按钮
        botNavBar.addItem(new BottomNavigationItem(R.drawable.ic_public_black_24dp, R.string.nav_title_news))
                .addItem(new BottomNavigationItem(R.drawable.ic_card_travel_black_24dp, R.string.nav_title_business))
                .addItem(new BottomNavigationItem(R.drawable.ic_art_track_black_24dp, R.string.nav_title_dynamic_state))
                .addItem(new BottomNavigationItem(R.drawable.ic_speaker_notes_black_24dp, R.string.nav_title_messages))
                .addItem(new BottomNavigationItem(R.drawable.ic_person_black_24dp, R.string.nav_title_personal))
                .setFirstSelectedPosition(lastSelectedPage)
                .initialise();
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.nav_view_pager);
        fragments = new ArrayList<Fragment>();
        fragments.add(new NewsFragment());
        fragments.add(new BusinessFragment());
        fragments.add(new DynamicStateFragment());
        fragments.add(new MessagesFragment());
        fragments.add(new PersonalFragment());

        viewPager.setAdapter(new NavPagerAdapter(getSupportFragmentManager(), fragments));
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(lastSelectedPage);
    }

    @Override
    public void onTabSelected(int position) {
        viewPager.setCurrentItem(position);
    }

    @Override
    public void onTabUnselected(int position) {
        Log.d(TAG, "[ 2 ]onTabUnselected() called with: position = [ " + position + " ]");
    }

    @Override
    public void onTabReselected(int position) {
        Log.d(TAG, "[ 3 ]onTabReselected() called with: position = [ " + position + " ]");
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.d(TAG, "[ 4 ]onPageScrolled() called with: position = [ " + position + " ]");
    }

    @Override
    public void onPageSelected(int position) {
        Log.d(TAG, "[ 5 ]onPageSelected() called with: position = [ " + position + " ]");
        botNavBar.selectTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        Log.d(TAG, "[ 5 ]onPageScrollStateChanged() called with: position = [ " + state + " ]");
    }
}
