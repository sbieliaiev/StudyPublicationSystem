package com.sbieliaiev.studypublicationsystem.ui.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.sbieliaiev.studypublicationsystem.ui.fragments.DraftFramgent;
import com.sbieliaiev.studypublicationsystem.ui.fragments.FavoriteFragment;
import com.sbieliaiev.studypublicationsystem.ui.fragments.HomeFragment;
import com.sbieliaiev.studypublicationsystem.ui.fragments.SettingsFragment;

/**
 * Adapter which provide to show the fragments on the home screen
 * @see com.sbieliaiev.studypublicationsystem.ui.activities.HomeActivity
 */
public final class HomePagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Constructor which provide to create the adapter from the fragment manager
     * @param fm instance of {@link FragmentManager}
     */
    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();

            case 1:
                return new DraftFramgent();
            case 2:
                return new FavoriteFragment();
            case 3:
                return new SettingsFragment();
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }
}
