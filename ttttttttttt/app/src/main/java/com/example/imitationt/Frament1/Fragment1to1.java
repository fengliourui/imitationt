package com.example.imitationt.Frament1;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.imitationt.MainActivity;
import com.example.imitationt.R;

public class Fragment1to1 extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1to1,container,false);          //关联布局文件

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Fragment1.bt1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        Fragment1.bt2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        Fragment1.bt1.setTextColor(Color.parseColor("#FF000000"));
        Fragment1.bt2.setTextColor(Color.rgb(148, 148, 148));
        Fragment1.bt3.setTextColor(Color.rgb(148, 148, 148));
    }


}
