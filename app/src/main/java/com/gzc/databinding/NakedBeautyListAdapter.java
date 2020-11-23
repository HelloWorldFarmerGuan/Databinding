package com.gzc.databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2020-09-13 19:11
 * Describe:
 */
public class NakedBeautyListAdapter extends RecyclerView.Adapter<NakedBeautyListAdapter.ViewHolder> {
    private List<NakedBeautyBean> dataBeanList = new ArrayList<>();
    private int variableId;//会自动生成
    private LayoutInflater inflater;
    private Context context;


    public NakedBeautyListAdapter(Context context, int variableId, List<NakedBeautyBean> dataBeanList) {
        this.context = context;
        this.dataBeanList = dataBeanList;
        this.variableId = variableId;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.item_layout, parent, false);
        return new ViewHolder(viewDataBinding.getRoot().getRootView(),viewDataBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NakedBeautyBean nakedBeautyBean = dataBeanList.get(position);
        holder.viewDataBinding.setVariable(variableId, nakedBeautyBean);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nakedBeautyBean.setBeGoodAt("真不错~");
                Toast.makeText(context, "下单成功，宝宝在晚上9点前到达战场~", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding viewDataBinding;
        public ViewHolder(@NonNull View itemView, ViewDataBinding viewDataBinding) {
            super(itemView);
            this.viewDataBinding = viewDataBinding;
        }
    }
}
