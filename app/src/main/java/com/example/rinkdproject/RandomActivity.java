package com.example.rinkdproject;


import android.os.Bundle;
import android.view.MenuItem;

import com.example.rinkdproject.ui.drink.DrinkFragment;
import com.example.rinkdproject.ui.heart.HeartFragment;
import com.example.rinkdproject.ui.home.HomeFragment;
import com.example.rinkdproject.ui.person.PersonFragment;
import com.example.rinkdproject.ui.star.StarFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.io.Serializable;
import java.util.ArrayList;

public class RandomActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();

    //5가지 fragment 객체 선언
    private HomeFragment homeFragment = new HomeFragment();
    private HeartFragment heartFragment = new HeartFragment();
    private PersonFragment personFragment = new PersonFragment();
    private StarFragment starFragment = new StarFragment();
    private DrinkFragment drinkFragment = new DrinkFragment();
  //  private SpotFragment spotFragment = new SpotFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        //처음 화면을 homefragment로 지정
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout,homeFragment).commitAllowingStateLoss();

        // 메뉴 아이템이 선택될때 호출될 리스너 등록
        // home, heart, person, star, drink 다섯가지 fragment
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:{
                        transaction.replace(R.id.frame_layout,homeFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_heart:{
                        transaction.replace(R.id.frame_layout,heartFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_person:{
                        transaction.replace(R.id.frame_layout,personFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_star:{
                        transaction.replace(R.id.frame_layout,starFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_drink:{
                        transaction.replace(R.id.frame_layout,drinkFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });

    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment).commit();      // Fragment로 사용할 MainActivity내의 layout공간을 선택합니다.
    }


}
