package com.example.imitationt.Frament1.Fragment1to3;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.imitationt.Frament1.Fragment1;
import com.example.imitationt.R;

public class Fragment1to3 extends Fragment {
    LinearLayout linearLayout;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1to3,container,false);          //关联布局文件

        linearLayout = view.findViewById(R.id.Linearlayout1);
        View view0 = LayoutInflater.from(getActivity()).inflate(R.layout.guangao, linearLayout, false);
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

    @Override
    public void onResume() {
        super.onResume();
        Fragment1.bt1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        Fragment1.bt1.setTextColor(Color.rgb(148, 148, 148));
        Fragment1.bt2.setTextColor(Color.rgb(148, 148, 148));
        Fragment1.bt3.setTextColor(Color.parseColor("#FF000000"));
    }
}
