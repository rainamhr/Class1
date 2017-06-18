package com.study.class1;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.VideoView;

import com.study.class1.fragments.BottomFragment;
import com.study.class1.fragments.TopFragment;
import com.study.class1.fragments.oneFragment;
import com.study.class1.fragments.threeFragment;
import com.study.class1.fragments.twoFragment;

public class ViewpagerActivity extends AppCompatActivity {

    ViewPager viewPager;
    TextView tab1, tab2, tab3, tab4, tab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        tab1 = (TextView) findViewById(R.id.tab1);
        tab2 = (TextView) findViewById(R.id.tab2);
        tab3 = (TextView) findViewById(R.id.tab3);
        tab4 = (TextView) findViewById(R.id.tab4);
        tab5 = (TextView) findViewById(R.id.tab5);

        tab1.setOnClickListener(tabclicklistener);
        tab2.setOnClickListener(tabclicklistener);
        tab3.setOnClickListener(tabclicklistener);
        tab4.setOnClickListener(tabclicklistener);
        tab5.setOnClickListener(tabclicklistener);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewpagerKoAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tab1.setTextColor(Color.GRAY);
                tab2.setTextColor(Color.GRAY);
                tab3.setTextColor(Color.GRAY);
                tab4.setTextColor(Color.GRAY);
                tab5.setTextColor(Color.GRAY);
                if (position == 0) {
                    tab1.setTextColor(Color.BLACK);
                } else if (position == 1) {
                    tab2.setTextColor(Color.BLACK);

                } else if (position == 2) {
                    tab3.setTextColor(Color.BLACK);

                } else if (position == 3) {
                    tab4.setTextColor(Color.BLACK);

                } else if (position == 4) {
                    tab5.setTextColor(Color.BLACK);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public View.OnClickListener tabclicklistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            tab1.setTextColor(Color.BLACK);
            tab2.setTextColor(Color.BLACK);
            tab3.setTextColor(Color.BLACK);
            tab4.setTextColor(Color.BLACK);
            tab5.setTextColor(Color.BLACK);
            if (id==R.id.tab1){
                viewPager.setCurrentItem(0);
                tab1.setTextColor(Color.RED);
            }else if(id== R.id.tab2){
                viewPager.setCurrentItem(1);
                tab2.setTextColor(Color.RED);
            }else if(id== R.id.tab3){
                viewPager.setCurrentItem(2);
                tab3.setTextColor(Color.RED);
            }else if(id== R.id.tab4){
                viewPager.setCurrentItem(3);
                tab4.setTextColor(Color.RED);
            }else if(id== R.id.tab5){
                viewPager.setCurrentItem(4);
                tab5.setTextColor(Color.RED);
            }

        }
    };

    public class ViewpagerKoAdapter extends FragmentPagerAdapter {

        public ViewpagerKoAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new TopFragment();
            } else if (position == 1) {
                return new BottomFragment();
            } else if (position == 2) {
                return new oneFragment();
            } else if (position == 3) {
                return new twoFragment();
            } else if (position == 4) {
                return new threeFragment();
            }
                return new TopFragment();
        }

            @Override
            public int getCount () {
                return 5;
            }
        }
    }

