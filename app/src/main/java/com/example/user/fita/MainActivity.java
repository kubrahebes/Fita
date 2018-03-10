package com.example.user.fita;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eightbitlab.bottomnavigationbar.BottomBarItem;
import com.eightbitlab.bottomnavigationbar.BottomNavigationBar;
import com.example.user.fita.fragment.AnaSayfaFragment;
import com.example.user.fita.fragment.FoodFragment;
import com.example.user.fita.fragment.MesureFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationBar bottomNavigationBar;
    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBarItem item = new BottomBarItem(R.drawable.ic_launcher_background, R.string.title);
        BottomBarItem item1 = new BottomBarItem(R.drawable.ic_launcher_background, R.string.title1);
        BottomBarItem item2 = new BottomBarItem(R.drawable.ic_launcher_background, R.string.title2);
        bottomNavigationBar = findViewById(R.id.bottom_bar);

        bottomNavigationBar.addTab(item).addTab(item1).addTab(item2);
        bottomNavigationBar.setOnSelectListener(new BottomNavigationBar.OnSelectListener() {
            @Override
            public void onSelect(int position) {
                switch (position) {
                    case 1:
                        fragment= new AnaSayfaFragment();
                        break;
                    case 2:
                        fragment=new FoodFragment();
                        break;
                    case 3:
                        fragment=new MesureFragment();
                        break;
                }

            }
        });
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content,fragment).commit();
    }



}

