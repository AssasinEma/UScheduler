package com.example.scheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Implement the first things in an app



    }

    public void onButtclick(View view)
    {

        TextView var =findViewById(R.id.txtHello);
        EditText txtvar = findViewById(R.id.editTxt);
        txtvar.getText().toString();
        var.setText(txtvar.getText().toString());

    }
}