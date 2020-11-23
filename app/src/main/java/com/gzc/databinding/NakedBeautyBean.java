package com.gzc.databinding;

import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.library.baseAdapters.BR;

import com.bumptech.glide.Glide;

/**
 * User: Administrator
 * Date: 2020-09-13 19:11
 * Describe:
 */
public class NakedBeautyBean extends BaseObservable {
    private String name;
    private int price;
    private String avatar;
    private String beGoodAt;

    public NakedBeautyBean(String name, int price, String avatar, String beGoodAt) {
        this.name = name;
        this.price = price;
        this.avatar = avatar;
        this.beGoodAt = beGoodAt;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
    }

    @Bindable
    public String getBeGoodAt() {
        return beGoodAt;
    }

    public void setBeGoodAt(String beGoodAt) {
        this.beGoodAt = beGoodAt;
        notifyPropertyChanged(BR.beGoodAt);
    }


    @BindingAdapter("avatar")
    public static void getAvatar(ImageView avatarView, String url){
        Glide.with(avatarView.getContext())
                .load(url)
                .into(avatarView);
    }
}
