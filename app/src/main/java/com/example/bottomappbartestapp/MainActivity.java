package com.example.bottomappbartestapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    MenuItem next;
    MenuItem help;
    Menu bab1Menu;
    FloatingActionButton fab1;
    BottomAppBar bab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab1 = findViewById(R.id.fab1);
        bab1 = findViewById(R.id.bab1);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyLogClass.toast("clicked fab", getBaseContext());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.bab_1_menu, menu);

        MyLogClass.d(menu.getItem(0).getItemId());
        MyLogClass.d(R.id.menu_bab1_help);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_bab1_help:
                MyLogClass.toast("help", getBaseContext());
                return true;
            case R.id.menu_bab1_next:
                MyLogClass.toast("next", getBaseContext());
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
