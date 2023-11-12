package com.example.imitationt;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class FragmentUtils {
    //继承BaseFragment
    public static void replaceFragment(FragmentActivity activity,int viewID,Fragment fragment){
        activity.getSupportFragmentManager().beginTransaction().replace(viewID, fragment).commit();
    }
    public static void show(FragmentActivity activity, Fragment fragment){
        activity.getSupportFragmentManager().beginTransaction().show(fragment).commit();
    }
    public static void hide(FragmentActivity activity,Fragment fragment){
        activity.getSupportFragmentManager().beginTransaction().hide(fragment).commit();
    }
    public static void remove(FragmentActivity activity){
        activity.getSupportFragmentManager().removeOnBackStackChangedListener(null);
    }
}
