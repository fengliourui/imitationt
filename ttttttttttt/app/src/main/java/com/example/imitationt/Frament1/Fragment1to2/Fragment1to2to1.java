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

public class Fragment1to2to1 extends Fragment {
    View view;
    LinearLayout linearLayout;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //关联布局文件
        view = inflater.inflate(R.layout.fragment1to2to1, container, false);

        linearLayout = view.findViewById(R.id.Linearlayout);
        linearLayout.removeAllViews();//清空布局确保之前这个布局是干净的
        View viewn = LayoutInflater.from(getActivity()).inflate(R.layout.guanggao, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(viewn);
        View view0 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem0, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view0);
        View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem1, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view1);
        View view2 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem2, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view2);
        View view3 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem3, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view3);
        View view4 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem4, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view4);
        View view5 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem5, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view5);
        View view6 = LayoutInflater.from(getActivity()).inflate(R.layout.forcaritem6, linearLayout, false);
        // 将填充好数据的新视图添加到 forecastLayout 布局中
        linearLayout.addView(view6);
        return view;
    }
}
