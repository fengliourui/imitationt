package com.example.imitationt.Fragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.imitationt.R;

public class Fragment2to1 extends Fragment {
    ImageView bt1,bt3,bt5;
    LinearLayout bt2,bt4,bt6;
    View view;

    LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment2to1, container, false);
        linearLayout =view.findViewById(R.id.Linearlayout2);
        linearLayout.removeAllViews();//清空布局确保之前这个布局是干净的
        for (int i = 0; i < 3; i++) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment2to1, linearLayout, false);
            // 将填充好数据的新视图添加到 forecastLayout 布局中
            linearLayout.addView(view);
        }
        initgetfind();
        initClickLister();
        return view;
    }

    private void initClickLister() {
        bt1.setOnClickListener(new View.OnClickListener() {
            int book=1;
            @Override
            public void onClick(View view) {
            if(book==1)
            {
                book=2;
                bt1.setImageResource(R.drawable.text3);
                bt2.setVisibility(View.GONE);
            }
            else if(book==2)
            {
                book=1;
                bt1.setImageResource(R.drawable.text2);
                bt2.setVisibility(View.VISIBLE);
            }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            int book=1;
            @Override
            public void onClick(View view) {
                if(book==1)
                {
                    book=2;
                    bt3.setImageResource(R.drawable.text3);
                    bt4.setVisibility(View.GONE);
                }
                else if(book==2)
                {
                    book=1;
                    bt3.setImageResource(R.drawable.text2);
                    bt4.setVisibility(View.VISIBLE);
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            int book=1;
            @Override
            public void onClick(View view) {
                if(book==1)
                {
                    book=2;
                    bt5.setImageResource(R.drawable.text3);
                    bt6.setVisibility(View.GONE);
                }
                else if(book==2)
                {
                    book=1;
                    bt5.setImageResource(R.drawable.text2);
                    bt6.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    private void initgetfind() {
        bt1=view.findViewById(R.id.qqqq1);
        bt2=view.findViewById(R.id.qqqq2);
        bt3=view.findViewById(R.id.qqqq3);
        bt4=view.findViewById(R.id.qqqq4);
        bt5=view.findViewById(R.id.qqqq5);
        bt6=view.findViewById(R.id.Linearlayout2);

    }
}