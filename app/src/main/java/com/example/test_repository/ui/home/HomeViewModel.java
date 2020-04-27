package com.example.test_repository.ui.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.test_repository.databinding.FragmentHomeBinding;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Integer> num;




    public MutableLiveData<Integer> getNum() {
        if(num==null){
            num=new MutableLiveData<>();
            num.setValue(0);
        }
        return num;
    }
    public void add(){
        num.setValue(num.getValue()+1);
    }

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}