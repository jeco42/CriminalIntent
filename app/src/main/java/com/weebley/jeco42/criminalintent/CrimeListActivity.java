package com.weebley.jeco42.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jucollins on 2/4/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
