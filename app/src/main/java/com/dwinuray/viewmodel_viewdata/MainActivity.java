package com.dwinuray.viewmodel_viewdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvMain;
    Button btnClick;
    MyViewModel mvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        tvMain   = findViewById(R.id.tvMain);
        btnClick = findViewById(R.id.button);
        btnClick.setOnClickListener(this);


        mvm = new ViewModelProvider(this).get(MyViewModel.class);

        mvm.getData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tvMain.setText(s);
            }
        });
    }


    @Override
    public void onClick(View v) {
        mvm.setData("Oke model klik baru");
    }
}
