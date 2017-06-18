package com.study.class1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, address, phone;
    RadioGroup gender;
    DatePicker dob;
    Button signup;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);

        sharedPreferences = getSharedPreferences("Userinfo",0);

        String namevalue = getIntent().getStringExtra("UserName");
        name = (EditText) findViewById(R.id.userName);
        email = (EditText) findViewById(R.id.email);
        address = (EditText) findViewById(R.id.address);
        phone = (EditText) findViewById(R.id.phone);
        signup = (Button) findViewById(R.id.signup1);
        gender = (RadioGroup) findViewById(R.id.gender);
        dob = (DatePicker) findViewById(R.id.dob);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                String namevalue= name.getText(). toString();
                String emailvalue= email.getText(). toString();
                String addressvalue= address.getText(). toString();
                String phonevalue= phone.getText(). toString();

                RadioButton checkedRB = (RadioButton) findViewById(gender.getCheckedRadioButtonId());
                String gendervalue=checkedRB.getText(). toString();
                String dobvalue= dob.getYear()+"-"+dob.getMonth()+"-"+dob.getDayOfMonth();


                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name",namevalue);
                editor.putString("email",emailvalue);
                editor.putString("address",addressvalue);
                editor.putString("phone",phonevalue);
                editor.putString("gender",addressvalue);
                editor.putString("phone",phonevalue);

                editor.commit();
                Toast.makeText(MainActivity.this, "User Info Inserted",Toast.LENGTH_LONG). show();

                startActivity(intent);
            }
        });
    }
}
