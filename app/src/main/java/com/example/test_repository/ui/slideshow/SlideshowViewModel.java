package com.example.test_repository.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {
    public MutableLiveData<Integer> num;

    public MutableLiveData<Integer> getNum() {
        if (num == null) {
            num = new MutableLiveData<>();
            num.setValue(0);
        }
        return num;
    }

    public void add() {
        num.setValue(num.getValue() + 1);
    }
}