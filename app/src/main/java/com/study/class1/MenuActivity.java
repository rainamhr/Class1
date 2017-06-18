package com.study.class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
                startActivity(new Intent(MenuActivity.this, Main2Activity.class));
                break;

            case R.id.menu2:
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
                break;

            case R.id.menu3:
                startActivity(new Intent(MenuActivity.this, Main3Activity.class));
                break;

            case R.id.menu4:
                startActivity(new Intent(MenuActivity.this, Main4Activity.class));
                break;

            case R.id.menu5:
                startActivity(new Intent(MenuActivity.this, Main5Activity.class));
                break;

            case R.id.menu6:
                Toast.makeText(MenuActivity.this, "menu6 clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu7:
                Toast.makeText(MenuActivity.this, "menu7 clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.menu8:
                Toast.makeText(MenuActivity.this, "menu8 clicked", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
