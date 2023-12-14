package com.example.imitationt.Frament1.Fragment1to2;

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

import com.example.imitationt.FragmentUtils;
import com.example.imitationt.Frament1.Fragment1;
import com.example.imitationt.MainActivity;
import com.example.imitationt.R;

public class Fragment1to2 extends Fragment {

    View view;
    LinearLayout textview1;
    LinearLayout textview2;
    LinearLayout textview3;
    LinearLayout textview4;
    LinearLayout textview5;
    LinearLayout textview6;
    LinearLayout textview7;
    LinearLayout textview8;
    LinearLayout textview9;
    LinearLayout textview10;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //关联布局文件
        view=inflater.inflate(R.layout.fragment1to2,container,false);
        //获取实例
        initView();
        //设置点击事件
        initClick();
        //设置该活动的初始状态
        initstart();
        return view;
    }

    private void initstart() {
        FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                new Fragment1to2to1());
    }

    private void initClick() {
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to1());
            }
        });
        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to2());
            }
        });
        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to3());
            }
        });
        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to4());
            }
        });
        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to5());
            }
        });
        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to6());
            }
        });
        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to7());
            }
        });
        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to8());
            }
        });
        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(getActivity(), R.id.thm,
                        new Fragment1to2to9());
            }
        });
    }

    private void initView() {
        textview1 = view.findViewById(R.id.txtview1);
        textview2 = view.findViewById(R.id.txtview2);
        textview3 = view.findViewById(R.id.txtview3);
        textview4 = view.findViewById(R.id.txtview4);
        textview5 = view.findViewById(R.id.txtview5);
        textview6 = view.findViewById(R.id.txtview6);
        textview7 = view.findViewById(R.id.txtview7);
        textview8 = view.findViewById(R.id.txtview8);
        textview9 = view.findViewById(R.id.txtview9);
        textview10 = view.findViewById(R.id.txtview10);
    }

    @Override
    public void onResume() {
        super.onResume();
        Fragment1.bt1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        Fragment1.bt3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt1.setTextColor(Color.rgb(148, 148, 148));
        Fragment1.bt2.setTextColor(Color.parseColor("#FF000000"));
        Fragment1.bt3.setTextColor(Color.rgb(148, 148, 148));
    }
}
