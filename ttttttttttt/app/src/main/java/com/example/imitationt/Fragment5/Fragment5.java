package com.example.imitationt.Fragment5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imitationt.R;

public class Fragment5  extends Fragment {

    private ViewPager2 viewPager2;
    private LinearLayout dotLayout;
    private Carousel carousel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment5, null);
        viewPager2 = view.findViewById(R.id.viewPager2);
        dotLayout = view.findViewById(R.id.index_dot);
        // 创建 Carousel 对象并初始化
        carousel = new Carousel(getActivity(), dotLayout, viewPager2);
        int[] images = {R.drawable.image1, R.drawable.image3, R.drawable.image2};
        carousel.initViews(images);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // 启动自动滚动
        carousel.startAutoScroll();
    }

    @Override
    public void onPause() {
        super.onPause();
        // 停止自动滚动
        carousel.stopAutoScroll();
    }
}
