package com.example.imitationt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.imitationt.Fragment2.Fragment2;
import com.example.imitationt.Fragment4.Fragment4;
import com.example.imitationt.Fragment5.Fragment5;
import com.example.imitationt.Frament1.Fragment1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.gyf.immersionbar.ImmersionBar;

public class MainActivity extends AppCompatActivity {

    private LinearLayout m1;//五个按钮
    private LinearLayout m2;
    private LinearLayout m3;
    private LinearLayout m4;
    private LinearLayout m5;

    private ImageView v1;
    private ImageView v2;
    private ImageView v3;
    private ImageView v4;
    private ImageView v5;
    public BottomSheetDialog bottomSheetDialog;//底层抽屉


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImmersionBar.with(this)
                .statusBarDarkFont(true)  // 设置状态栏字体为深色
                .init();

        initBottomsheetDialog();//设置底部抽屉
        initView();//获取各个实例
        initState();//初始化应用的初始状态
        initEvent();//初始化视图的点击事件监听器

    }

    private void initBottomsheetDialog() {
        // 初始化 BottomSheetDialog
        bottomSheetDialog = new BottomSheetDialog(MainActivity.this,R.style.BottomSheetDialog);
        bottomSheetDialog.setContentView(R.layout.bottomth3);
        // 设置点击外部区域关闭
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        // 可选：设置行为
        View bottomSheetView = bottomSheetDialog.findViewById(R.id.fragment3th);
        if (bottomSheetView != null) {
            BottomSheetBehavior<View> behavior = BottomSheetBehavior.from((View) bottomSheetView.getParent());
            behavior.setPeekHeight(10000); // 设置最小高度
        }
    }

    //获取各个实例
    private void initView() {
        m1 = findViewById(R.id.fragment1);
        m2 = findViewById(R.id.fragment2);
        m3 = findViewById(R.id.fragment3);
        m4 = findViewById(R.id.fragment4);
        m5 = findViewById(R.id.fragment5);
        v1 = findViewById(R.id.thid1);
        v2 = findViewById(R.id.thid2);
        v3 = findViewById(R.id.thid3);
        v4 = findViewById(R.id.thid4);
        v5 = findViewById(R.id.thid5);

    }

    //初始化应用状态
    private void initState() {
        // 初始化
        FragmentUtils.replaceFragment(MainActivity.this, R.id.fl_Demo,
                new Fragment1());

    }

    //设置点击事件
    private void initEvent() {
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.fl_Demo,
                        new Fragment1());
                checkState(1);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.fl_Demo,
                        new Fragment2());
                checkState(2);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog.show();
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.fl_Demo,
                        new Fragment4());
                checkState(4);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentUtils.replaceFragment(MainActivity.this, R.id.fl_Demo,
                        new Fragment5());
                checkState(5);
            }
        });
    }

    public void checkState(int index) {

       v1.setImageResource(R.drawable.bottomht1);
       v2.setImageResource(R.drawable.bottomht2);
       v3.setImageResource(R.drawable.bottom3);
       v4.setImageResource(R.drawable.bottomht4);
       v5.setImageResource(R.drawable.bottomht5);
        if (index == 1) {
            v1.setImageResource(R.drawable.bottom1);
            return;
        }
        if (index == 2) {
            v2.setImageResource(R.drawable.bottom2);
            return;
        }
        if (index == 4) {
            v4.setImageResource(R.drawable.bottom4);
            return;
        }
        if (index == 5) {
            v5.setImageResource(R.drawable.bottom5);
            return;
        }
    }
}
