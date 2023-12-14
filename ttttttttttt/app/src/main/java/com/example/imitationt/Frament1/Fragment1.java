package com.example.imitationt.Frament1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imitationt.Frament1.Fragment1to2.Fragment1to2;
import com.example.imitationt.Frament1.Fragment1to3.Fragment1to3;
import com.example.imitationt.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {
    private ViewPager2 vp;
    View view;
    public static TextView bt1, bt2, bt3;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);          //关联布局文件
        initFragment();//将三个Fragment添加到Viewpaper2中
        initClick();//给三个TextView(bt1, bt2, bt3)设置点击事件。当点击按钮时，通过调用vp.setCurrentItem()方法切换到对应的Fragment页面
        return view;
    }


    private void initFragment() {
        final List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1to1());
        list.add(new Fragment1to2());
        list.add(new Fragment1to3());

        vp = view.findViewById(R.id.viewPager2);               //获得ViewPager2控件
//设置预加载的Fragment页面数量，可防止流式布局StaggeredGrid数组越界错误。
        vp.setOffscreenPageLimit(list.size() - 1);                                                                                                                        //设置适配器
        FragmentStateAdapter adapter = new FragmentStateAdapter(this) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return list.get(position);
            }

            @Override
            public int getItemCount() {
                return list.size();
            }
        };
        vp.setAdapter(adapter);                     //把适配器添加给ViewPager2

    }

    @SuppressLint("WrongViewCast")
    private void initClick() {

        //给新品选项添加点击事件
        bt1 = view.findViewById(R.id.fragment1to1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(0, false);
            }
        });
        bt2 = view.findViewById(R.id.fragment1to2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(1, false);
            }
        });

        bt3 = view.findViewById(R.id.fragment1to3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vp.setCurrentItem(2, false);
            }
        });
    }
}
