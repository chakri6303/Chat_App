package com.example.android.whatsapp.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.whatsapp.Fragments.ChatsFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return new ChatsFragment();
    }

    @Override
    public int getCount() {
        return 1; // Return 1 for a single tab
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "CHATS";
    }
}
