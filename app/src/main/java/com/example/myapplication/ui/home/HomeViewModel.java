package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    protected String PageText = "This is home fragment";

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(PageText);
    }
    public LiveData<String> getText() {
        return mText;
    }
}