package com.study.class1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText username, password;
    Button login, signup;
 SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        username = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);

        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signUp);

        sharedPreferences=getSharedPreferences("Userinfo",0);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                String usernamevalue = username.getText(). toString();
                String passwordvalue = password.getText(). toString();

                String registeredusernamevalue = sharedPreferences.getString("username","");
                String registeredpasswordvalue = sharedPreferences.getString("password","");

                if(usernamevalue.length()==0){
                    username.setError("Enter Value");
                }
                if (usernamevalue.equals(registeredpasswordvalue)&& passwordvalue.equals(registeredpasswordvalue)){
                    Toast.makeText(Main2Activity.this, "login succesfull", Toast.LENGTH_LONG).show();
                    intent.putExtra("username",usernamevalue);
                    startActivity(intent);

                }else {
                    Toast.makeText(Main2Activity.this,"login failure",Toast.LENGTH_LONG).show();
                }

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(Main2Activity.this, Main3Activity.class);
                        startActivity(intent1);
                    }
                });
            }
            });
                Log.d("lifecycle", "onCreate was called");
            }


            @Override
            protected void onStart() {
                super.onStart();
                Log.d("lifecycle", "onStart was called");
            }

            @Override
            protected void onResume() {
                super.onResume();
                Log.d("lifecycle", "onResume was called");
            }

            @Override
            protected void onPause() {
                super.onPause();
                Log.d("lifecycle", "onPause was called");
            }

            @Override
            protected void onStop() {
                super.onStop();
                Log.d("lifecycle", "onStop was called");
            }

            @Override
            protected void onRestart() {
                super.onRestart();
                Log.d("lifecycle", "onRestart was called");
            }

            @Override
            protected void onDestroy() {
                super.onDestroy();
                Log.d("lifecycle", "onDestroy was called");
            }
        }
