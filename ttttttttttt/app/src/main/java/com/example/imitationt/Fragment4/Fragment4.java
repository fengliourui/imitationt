package com.example.imitationt.Fragment4;

import static com.example.imitationt.R.color.fragment4to3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;

import com.example.imitationt.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment4  extends Fragment {
    View view;
    List<Integer> list= new ArrayList<>();
    LinearLayout book1,book2;
    LinearLayoutCompat lock1,lock2,lock3,lock4,lock5,lock6,lock7;
    FrameLayout book3,book4,book5,book6,book7,book8,book9;
    ImageView book10;
    ImageView tm1,tm2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment4, null);
        initget();
        initClick();
        return view;
    }

    private void initchange(int x) {

        int color1 = getResources().getColor(R.color.fragment4to3); // 初始未选中颜色
        int color2 = getResources().getColor(R.color.white); // 初始选中颜色

        int color3 = getResources().getColor(R.color.fragment4to1); // 初始选中颜色
        int color4 = getResources().getColor(R.color.fragment4to2); // 初始未选中颜色

        int x1 =R.drawable.book1;
        int x2 =R.drawable.book2;
        int x3 =R.drawable.book3;
        int x4 =R.drawable.book4;


        book1.setBackgroundColor(color1);
        book2.setBackgroundColor(color1);
        book3.setBackgroundColor(color1);
        book4.setBackgroundColor(color1);
        book5.setBackgroundColor(color1);
        book6.setBackgroundColor(color1);
        book7.setBackgroundColor(color1);
        book8.setBackgroundColor(color1);
        book9.setBackgroundColor(color1);

        lock1.setBackgroundColor(color4);
        lock2.setBackgroundColor(color4);
        lock3.setBackgroundColor(color4);
        lock4.setBackgroundColor(color4);
        lock5.setBackgroundColor(color4);
        lock6.setBackgroundColor(color4);
        lock7.setBackgroundColor(color4);

        tm1.setImageResource(x1);
        tm2.setImageResource(x3);


        if(x==1)
        {
            book1.setBackgroundColor(color2);
            tm1.setImageResource(x2);
        }
        else if(x==2)
        {
            book2.setBackgroundColor(color2);
            tm2.setImageResource(x4);
        }
        else if(x==3)
        {
            book3.setBackgroundColor(color2);
            lock1.setBackgroundColor(color3);
        }
        else if(x==4)
        {
            book4.setBackgroundColor(color2);
            lock2.setBackgroundColor(color3);
        }
        else if(x==5)
        {
            book5.setBackgroundColor(color2);
            lock3.setBackgroundColor(color3);
        }
        else if(x==6)
        {
            book6.setBackgroundColor(color2);
            lock4.setBackgroundColor(color3);
        }
        else if(x==7)
        {
            book7.setBackgroundColor(color2);
            lock5.setBackgroundColor(color3);
        }
        else if(x==8)
        {
            book8.setBackgroundColor(color2);
            lock6.setBackgroundColor(color3);
        }
        else if(x==9)
        {
            book9.setBackgroundColor(color2);
            lock7.setBackgroundColor(color3);
        }

    }

    private void initClick() {
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(0));
                initchange(1);
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(1));
                initchange(2);
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(2));
                initchange(3);
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(3));
                initchange(4);
            }
        });
        book5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(4));
                initchange(5);
            }
        });
        book6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(5));
                initchange(6);
            }
        });
        book7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(6));
                initchange(7);
            }
        });
        book8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(7));
                initchange(8);
            }
        });
        book9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                book10.setImageResource(list.get(8));
                initchange(9);
            }
        });
    }

    private void initget() {
        int x1 = R.drawable.book15;
        int x2 = R.drawable.book16;
        int x3 = R.drawable.book17;
        int x4 = R.drawable.book18;
        int x5 = R.drawable.book20;
        int x6 = R.drawable.book21;
        int x7 = R.drawable.book22;
        int x8 = R.drawable.book23;
        int x9 = R.drawable.book24;
        list.add(x1);
        list.add(x2);
        list.add(x3);
        list.add(x4);
        list.add(x5);
        list.add(x6);
        list.add(x7);
        list.add(x8);
        list.add(x9);

        book1=view.findViewById(R.id.book1);
        book2=view.findViewById(R.id.book2);
        book3=view.findViewById(R.id.book3);
        book4=view.findViewById(R.id.book4);
        book5=view.findViewById(R.id.book5);
        book6=view.findViewById(R.id.book6);
        book7=view.findViewById(R.id.book7);
        book8=view.findViewById(R.id.book8);
        book9=view.findViewById(R.id.book9);
        book10=view.findViewById(R.id.book10);

        lock1 = view.findViewById(R.id.lock1);
        lock2 = view.findViewById(R.id.lock2);
        lock3 = view.findViewById(R.id.lock3);
        lock4 = view.findViewById(R.id.lock4);
        lock5 = view.findViewById(R.id.lock5);
        lock6 = view.findViewById(R.id.lock6);
        lock7 = view.findViewById(R.id.lock7);

        tm1 = view.findViewById(R.id.tm1);
        tm2 = view.findViewById(R.id.tm2);
    }
}
