package com.example.imitationt.Frament1.Fragment1to2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.imitationt.R;

public class Fragment1to2to9 extends Fragment {
    View view;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //关联布局文件
        view= inflater.inflate(R.layout.fragment1to2to9, container, false);
        return view;
    }
}
