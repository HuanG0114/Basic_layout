package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    BottomNavigationView bottomNavigationView,bottomNavigationView2;
    ActionBarDrawerToggle drawerToggle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.home_btn);




        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.home_btn:

                        return  true;

                    case R.id.book_btn:
                        startActivity(new Intent(getApplicationContext(),Publish_page.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.search_btn:
                        startActivity(new Intent(getApplicationContext(), Search_page.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.notify_btn:
                        startActivity(new Intent(getApplicationContext(), notification_page.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.My_btn:
                        startActivity(new Intent(getApplicationContext(), My_page.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}