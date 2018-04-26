package com.example.amirhossein.lfragmentwithviewpager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.amirhossein.lfragmentwithviewpager.Fragments.Page1Fragment;
import com.example.amirhossein.lfragmentwithviewpager.Fragments.Page2Fragment;
import com.example.amirhossein.lfragmentwithviewpager.Fragments.Page3Fragment;
import com.example.amirhossein.lfragmentwithviewpager.Fragments.Page4Fragment;
import com.example.amirhossein.lfragmentwithviewpager.Fragments.Page5Fragment;

/**
 * Created by Amir Hossein on 4/27/2018.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position) {
            case 0:
                returnFragment = Page1Fragment.newInstance();
                break;
            case 1:
                returnFragment = Page2Fragment.newInstance();
                break;
            case 2:
                returnFragment = Page3Fragment.newInstance();
                break;
            case 3:
                returnFragment = Page4Fragment.newInstance();
                break;
            case 4:
                returnFragment = Page5Fragment.newInstance();
                break;
            default:
                return null;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position) {
            case 0:
                title = "Page 1";
                break;
            case 1:
                title = "Page 2";
                break;
            case 2:
                title = "Page 3";
                break;
            case 3:
                title = "Page 4";
                break;
            case 4:
                title = "Page 5";
                break;
            default:
                return null;
        }
        return title;
    }
}
