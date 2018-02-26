package com.example.estudos.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.estudos.fragments.tab1Fragment;
import com.example.estudos.fragments.tab2Fragment;
import com.example.estudos.fragments.tab3Fragment;

/**
 * Created by Marques on 23/02/2018.
 */

public class TableAdapter extends FragmentStatePagerAdapter {

    private String[] titulosTabs = {"Fragment-1", "Fragment-2", "Fragment-3"};

    public TableAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new tab1Fragment();
                break;
            case 1:
                fragment = new tab2Fragment();
                break;
            case 2:
                fragment = new tab3Fragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return titulosTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulosTabs[position];
    }
}
