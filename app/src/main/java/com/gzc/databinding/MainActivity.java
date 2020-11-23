package com.gzc.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gzc.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView dataListView;
    private List<NakedBeautyBean> nakedBeautyBeans = new ArrayList<>();
    private NakedBeautyListAdapter nakedBeautyListAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        UserBean userBean = new UserBean(0,"gzc",'男',27);
        binding.setUser(userBean);

        dataListView = findViewById(R.id.data_list_view);

        nakedBeautyBeans.add(new NakedBeautyBean("西西",2000,"https://dss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2740256896,1985134505&fm=26&gp=0.jpg","镇单之宝"));

        nakedBeautyListAdapter = new NakedBeautyListAdapter(this, BR.beauty,nakedBeautyBeans);
        dataListView.setLayoutManager(new LinearLayoutManager(this));
        dataListView.setAdapter(nakedBeautyListAdapter);
    }
}