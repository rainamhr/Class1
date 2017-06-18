package com.study.class1;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.study.class1.fragments.BottomFragment;
import com.study.class1.fragments.TopFragment;
import com.study.class1.fragments.oneFragment;
import com.study.class1.fragments.threeFragment;
import com.study.class1.fragments.twoFragment;

import java.util.ArrayList;
import java.util.List;

public class coordinatorActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
   ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

     viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

       tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

   private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TopFragment(), "ONE");
        adapter.addFragment(new BottomFragment(), "TWO");
        adapter.addFragment(new oneFragment(), "THREE");
        adapter.addFragment(new twoFragment(), "FOUR");
        adapter.addFragment(new threeFragment(), "FIVE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu1:
                startActivity(new Intent(coordinatorActivity.this, Main2Activity.class));
                break;

            case R.id.menu2:
                startActivity(new Intent(coordinatorActivity.this, MainActivity.class));
                break;

            case R.id.menu3:
                startActivity(new Intent(coordinatorActivity.this, Main3Activity.class));
                break;

            case R.id.menu4:
                startActivity(new Intent(coordinatorActivity.this, Main4Activity.class));
                break;

            case R.id.menu5:
                startActivity(new Intent(coordinatorActivity.this, Main5Activity.class));
                break;

            case R.id.menu6:
                Toast.makeText(coordinatorActivity.this, "menu6 clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu7:
                Toast.makeText(coordinatorActivity.this, "menu7 clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu8:
                Toast.makeText(coordinatorActivity.this, "menu8 clicked", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}

