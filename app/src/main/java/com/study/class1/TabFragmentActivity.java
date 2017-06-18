package com.study.class1;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.study.class1.fragments.BottomFragment;
import com.study.class1.fragments.TopFragment;
import com.study.class1.fragments.oneFragment;
import com.study.class1.fragments.threeFragment;
import com.study.class1.fragments.twoFragment;

import static com.study.class1.R.*;

public class TabFragmentActivity extends AppCompatActivity {
    TextView tab1, tab2, tab3, tab4, tab5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_fragment);

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
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TopFragment()).commit();

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
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new TopFragment()).commit();
                tab1.setTextColor(Color.MAGENTA);
            }else if(id== R.id.tab2){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new BottomFragment()).commit();
                tab2.setTextColor(Color.MAGENTA);
            }else if(id== R.id.tab3){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new oneFragment()).commit();
                tab3.setTextColor(Color.MAGENTA);
            }else if(id== R.id.tab4){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new twoFragment()).commit();
                tab4.setTextColor(Color.MAGENTA);
            }else if(id== R.id.tab5){
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new threeFragment()).commit();
                tab5.setTextColor(Color.MAGENTA);
            }

        }
    };
}
