package com.example.basicmvvm;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MainActivityModel model = new MainActivityModel();

    MutableLiveData<String> fruitsLiveData = new MutableLiveData<String>();


    public void getRandomFruits(){
        String fruits = model.getRandomFruits();
        fruitsLiveData.postValue(fruits);
    }


}
