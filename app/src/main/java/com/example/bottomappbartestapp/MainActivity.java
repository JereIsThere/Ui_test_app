package com.example.bottomappbartestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    MenuItem next;
    MenuItem help;
    Menu bab1Menu;
    FloatingActionButton fab1;
    BottomAppBar bab1;
    Slider slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAppBarAndFab();
        initSlider();

    }

    private void initAppBarAndFab() {
        fab1 = findViewById(R.id.fab1);
        bab1 = findViewById(R.id.bab1);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyLogClass.toast("clicked fab", getBaseContext());

                transitionToActivity2();

            }
        });

        bab1.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_bab1_help:
                        MyLogClass.toast("help", getBaseContext());
                        return true;
                    case R.id.menu_bab1_next:
                        MyLogClass.toast("next", getBaseContext());
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void transitionToActivity2() {
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(i);
    }

    private void initSlider() {
        slider = findViewById(R.id.slider1);

        slider.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                MyLogClass.toastLength = (int) value;
            }
        });
    }
}
