package com.study.class1.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.study.class1.FragmentExampleActivity;
import com.study.class1.Main3Activity;
import com.study.class1.MainActivity;
import com.study.class1.R;

/**
 * Created by $raina on $5/23/2017.
 */

public class TopFragment extends Fragment {

    EditText username, password;
    Button login, signup;
    SharedPreferences sharedPreferences;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login_page,null);

        username = (EditText) view.findViewById(R.id.userName);
        password = (EditText) view.findViewById(R.id.password);

        login = (Button) view.findViewById(R.id.login);
        signup = (Button) view.findViewById(R.id.signUp);

        sharedPreferences= getActivity().getSharedPreferences("Userinfo",0);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main3Activity.class);
                final String usernamevalue = username.getText(). toString();
                final String passwordvalue = password.getText(). toString();

                String registeredusernamevalue = sharedPreferences.getString("username","");
                String registeredpasswordvalue = sharedPreferences.getString("password","");

                if(usernamevalue.length()==0){
                    username.setError("Enter Value");
                }
                if (usernamevalue.equals(registeredpasswordvalue)&& passwordvalue.equals(registeredpasswordvalue)){
                    Toast.makeText(getActivity(), "login succesfull", Toast.LENGTH_LONG).show();
                    intent.putExtra("username",usernamevalue);
                    startActivity(intent);

                }else {
                    Toast.makeText(getActivity(),"login failure",Toast.LENGTH_LONG).show();
                }

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(getActivity(), Main3Activity.class);

                        ((FragmentExampleActivity)getActivity()).setTextViewValue(usernamevalue + passwordvalue);
                        startActivity(intent1);
                    }
                });
            }
        });

        return view;
    }
}
