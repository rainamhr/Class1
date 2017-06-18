package com.study.class1.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.GestureDetectorCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.study.class1.Main3Activity;
import com.study.class1.Main4Activity;
import com.study.class1.R;

/**
 * Created by $raina on $5/23/2017.
 */

public class BottomFragment extends Fragment {
    TextView textview;

    Button gallery;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_page,null);

        gallery = (Button) view.findViewById(R.id.gallery);

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main4Activity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public void setTextview (String value){
        textview.setText(value);
    }
}
