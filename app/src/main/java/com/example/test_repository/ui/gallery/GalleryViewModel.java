package com.example.test_repository.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> num;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        if (mText == null) {
            mText = new MutableLiveData<>();
            mText.setValue(" ");
        }
        return mText;
    }

    public MutableLiveData<Integer> getNum() {
        if (num == null) {
            num = new MutableLiveData<>();
            num.setValue(0);
        }
        return num;
    }

    public void addNum() {
        num.setValue(num.getValue() + 1);
    }
}