package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class btn1 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
        textView = findViewById(R.id.txtView);
    }

    public void toggleBtnClick(View view){
        if (((ToggleButton)view).isChecked()) {
            textView.setText("ToggleButton is ON");
        }else{
            textView.setText("ToggleButton is OFF");
        }
    }

    public void switchClick(View view){
        if (((Switch)view).isChecked()) {
            textView.setText("Switch is ON");
        }else{
            textView.setText("Switch is OFF");
        }
    }
}