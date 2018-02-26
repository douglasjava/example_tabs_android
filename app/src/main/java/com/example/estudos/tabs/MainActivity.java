package com.example.estudos.tabs;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.estudos.adapter.TableAdapter;
import com.example.estudos.uteis.SlidingTabLayout;

import static com.example.estudos.uteis.Permissions.validaPermissoes;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlidingTabLayout slidingTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validaPermissoes(getApplicationContext(), this);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar");
        setSupportActionBar(toolbar);

        slidingTabLayout = findViewById(R.id.stl_tabs);
        viewPager = findViewById(R.id.vp_tabs);

        slidingTabLayout.setDistributeEvenly(true);
        slidingTabLayout.setSelectedIndicatorColors(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        TableAdapter tableAdapter = new TableAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tableAdapter);

        

        slidingTabLayout.setViewPager(viewPager);



    }
}
