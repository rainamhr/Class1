package com.study.class1;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.study.class1.fragments.BottomFragment;
import com.study.class1.fragments.TopFragment;
import com.study.class1.fragments.oneFragment;
import com.study.class1.fragments.threeFragment;
import com.study.class1.fragments.twoFragment;


public class FragmentExampleActivity extends AppCompatActivity {
    BottomFragment bottomFragment;
    TopFragment topFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
        Log.d("show","called");

        bottomFragment = new BottomFragment();
        topFragment = new TopFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.topFragment, topFragment);
        transaction.replace(R.id.buttomFragment, bottomFragment);
        transaction.replace(R.id.oneFragment, new oneFragment());
        transaction.replace(R.id.twoFragment, new twoFragment());
        transaction.replace(R.id.threeFragment, new threeFragment());

        transaction.commit();
    }

    public void setTextViewValue(String value){
    bottomFragment.setTextview(value);
    }
}
