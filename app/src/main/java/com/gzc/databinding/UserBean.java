package com.gzc.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * author：gzc
 * date：2020/11/23
 * describe：
 */
public class UserBean extends BaseObservable {
    private long id;
    private String name;
    private char sex;
    private int age;

    public UserBean(long id, String name, char sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Bindable
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public char getSex(){
        return sex;
    }

    public void setSex(char sex){
        this.sex = sex;
        notifyPropertyChanged(BR.sex);
    }

    @Bindable
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
        notifyPropertyChanged(age);
    }
}
