package com.study.class1.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.study.class1.Main4Activity;
import com.study.class1.Main5Activity;
import com.study.class1.NamiActivity;
import com.study.class1.R;
import com.study.class1.ZoroActiity;

/**
 * Created by $raina on $5/23/2017.
 */

public class oneFragment extends Fragment {

    Button luffy, zoro, nami, usopp, chopper, sanji;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.gallery,null);

        luffy = (Button) view.findViewById(R.id.pic);
        zoro = (Button) view.findViewById(R.id.pic1);
        nami = (Button) view.findViewById(R.id.pic3);
        usopp = (Button) view.findViewById(R.id.pic4);
        chopper = (Button) view.findViewById(R.id.pic5);
        sanji = (Button) view.findViewById(R.id.pic6);

        luffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main5Activity.class);
                startActivity(intent);
            }
        });
        zoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ZoroActiity.class);
                startActivity(intent);
            }
        });
        nami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NamiActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
