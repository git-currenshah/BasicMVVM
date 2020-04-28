package com.example.basicmvvm;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.Observer;

public class MainActivityFragment  extends Fragment {

    private static final String TAG = "MainActivityFragment";

    private MainActivityViewModel viewModel = new MainActivityViewModel();

    private Button randomButton;
    private TextView hello_world;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_main,container,false);
        randomButton = root.findViewById(R.id.random_button);
        hello_world = root.findViewById(R.id.fruits_textview);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupClickListners();
        observeFruits();
    }

    private void setupClickListners(){

        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.getRandomFruits();
            }
        });

    }

    private void observeFruits(){
        viewModel.fruitsLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

                Log.d(TAG, "onChanged: "+s);

                hello_world.setText(s);

            }
        });
        };
    }
