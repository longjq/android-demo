package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new buttonListener());
    }

    class buttonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            editText = (EditText) findViewById(R.id.txt);
            String number = editText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
            startActivity(intent);
        }
    }
}