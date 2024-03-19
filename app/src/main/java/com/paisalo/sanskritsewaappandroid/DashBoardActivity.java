package com.paisalo.sanskritsewaappandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashBoardActivity extends AppCompatActivity {
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        // Find the NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        // Get the NavController
        navController = navHostFragment.getNavController();

        // Find the BottomNavigationView
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_view);

        // Set up the BottomNavigationView with the NavController
        NavigationUI.setupWithNavController(bottomNav, navController);


        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.destination1:
                        navController.navigate(R.id.dashboard_fragment);
                        return true;
                    case R.id.destination2:
                        navController.navigate(R.id.searchFragment);
                        return true;
                    case R.id.destination3:
                        navController.navigate(R.id.supportFragment);
                        return true;
                    case R.id.destination4:
                        navController.navigate(R.id.profileFragment);
                        return true;

                }
                return false;
            }
        });
    }
}