package com.example.imitationt.Frament1.Fragment1to2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.imitationt.R;

public class Fragment1to2to7 extends Fragment {
    View view;
    LinearLayout linearLayout;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //关联布局文件
        view= inflater.inflate(R.layout.fragment1to2to7, container, false);
        linearLayout =view.findViewById(R.id.Linearlayout);
        linearLayout.removeAllViews();//清空布局确保之前这个布局是干净的
        for (int i = 0; i < 15; i++) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem6, linearLayout, false);
            // 将填充好数据的新视图添加到 forecastLayout 布局中
            linearLayout.addView(view);
        }
        return view;
    }
}
