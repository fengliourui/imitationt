package com.example.imitationt.Fragment2;

import static com.example.imitationt.R.color.white;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitationt.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {

    private List<String> list;
    Context context;

    List<Integer> list1=new ArrayList<>();

    ImageView imageView ;
   private int selectedPosition = RecyclerView.NO_POSITION;

    public Adapter(List<String> list, Context context,  ImageView imageView) {
        this.list = list;
        this.context = context;
        this.imageView = imageView;
        int x1 = R.drawable.demole1;
        int x2 = R.drawable.demole2;
        int x3 = R.drawable.demole3;
        int x4 = R.drawable.demole4;
        int x5 = R.drawable.demole5;
        int x6 = R.drawable.demole6;
        int x7 = R.drawable.demole7;
        int x8 = R.drawable.demole8;
        int x9 = R.drawable.demole9;
        int x10 = R.drawable.demole10;
        int x11 = R.drawable.demole11;
        int x12 = R.drawable.demole12;
        int x13 = R.drawable.demole13;
        int x14 = R.drawable.demole14;
        int x15 = R.drawable.demole15;
        int x16 = R.drawable.demole16;
        int x17 = R.drawable.demole17;
        int x18 = R.drawable.demole18;
        int x19 = R.drawable.demole19;
        int x20 = R.drawable.demole20;
        int x21 = R.drawable.demole21;
        int x22 = R.drawable.demole22;
        int x23 = R.drawable.demole23;
        int x24 = R.drawable.demole24;
        int x25 = R.drawable.demole25;
        int x26 = R.drawable.demole26;
        list1.add(x1);
        list1.add(x2);
        list1.add(x3);
        list1.add(x4);
        list1.add(x5);
        list1.add(x6);
        list1.add(x7);
        list1.add(x8);
        list1.add(x9);
        list1.add(x10);
        list1.add(x11);
        list1.add(x12);
        list1.add(x13);
        list1.add(x14);
        list1.add(x15);
        list1.add(x16);
        list1.add(x17);
        list1.add(x18);
        list1.add(x19);
        list1.add(x20);
        list1.add(x21);
        list1.add(x22);
        list1.add(x23);
        list1.add(x24);
        list1.add(x25);
        list1.add(x26);
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment2_item, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        String string = list.get(position);
        holder.textView.setText(string);
        int color = ContextCompat.getColor(context, R.color.white);
        int color1 = ContextCompat.getColor(context, R.color.graw);
        if (position == selectedPosition) {
            holder.linearLayout.setBackgroundColor(color); // 设置选中子项的背景颜色
            holder.view.setVisibility(View.VISIBLE);

            // 设置ImageView的图片资源
            int resourceId = list1.get(position % list1.size());
            imageView.setImageResource(resourceId);
        } else {
            holder.linearLayout.setBackgroundColor(color1); // 恢复为默认的背景颜色
            holder.view.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        View view;
        TextView textView;

        LinearLayout linearLayout;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView.findViewById(R.id.view1);
            textView = itemView.findViewById(R.id.textview1);
            linearLayout =itemView.findViewById(R.id.linear);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition(); // 获取当前子项的位置
            if (position != RecyclerView.NO_POSITION) { // 确保位置是有效的
                if (selectedPosition == position) {
                    return; // 如果点击的是已经选中的子项，则不做任何处理
                }
                int  previousSelected = selectedPosition;
                selectedPosition = position; // 更新选中的位置
                notifyItemChanged(previousSelected); // 刷新之前选中的子项
                notifyItemChanged(selectedPosition); // 刷新当前选中的子项

                // 设置ImageView的图片资源
                int resourceId = list1.get(position % list1.size());
                imageView.setImageResource(resourceId);
            }
        }
    }
}
