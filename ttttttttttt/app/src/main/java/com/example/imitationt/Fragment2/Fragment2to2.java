package com.example.imitationt.Fragment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.imitationt.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fragment2to2 extends Fragment {
    View view;
    RecyclerView recyclerView;
    List<String> list= new ArrayList<>();

    ImageView imageView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_fragment2to2, container, false);
        list.addAll(Arrays.asList("推荐","热门","黑马","游戏","地区","校园","娱乐","动漫","数码","体育","情感","直播","小说","影视综","历史","行业","汽车","音乐","科学","时尚","搞笑","财经","摄影","家居","艺术","旅游"));
        recyclerView =view.findViewById(R.id.recyle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL, false));
        imageView = view.findViewById(R.id.qqqq6);
        Adapter adapter =new Adapter(list,getContext(),imageView);
        recyclerView.setAdapter(adapter);
        return view;
    }
}