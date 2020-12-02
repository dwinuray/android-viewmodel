package com.dwinuray.viewmodel_viewdata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<String> data;

    public MutableLiveData<String> getData() {
        if ( data == null ) {

            data = new MutableLiveData<>();
            setData("Telah ter-set model baru !");
        }
        return data;
    }

    public void setData(String text) {
        this.data.postValue(text);
    }
}
