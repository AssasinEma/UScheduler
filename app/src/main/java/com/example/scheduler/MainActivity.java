package com.example.scheduler;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout parent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide(); //Hides action bar


        setContentView(R.layout.activity_main);

        parent =  findViewById(R.id.Welcome);
        Button enrollUser = findViewById(R.id.enroll);

        enrollUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    enrollWithTxt();
            }
        });

    }

    private void enrollWithTxt ()
    {
        TextView group = findViewById(R.id.editTxt);
        if (TextUtils.isEmpty(group.getText()))
            Snackbar.make(parent, "You have not selected any group!", Snackbar.LENGTH_SHORT).show();
        else
            Snackbar.make(parent, "You have enrolled in "+ group.getText().toString(), Snackbar.LENGTH_INDEFINITE)
                    .setAction("Next", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            String grupacurenta = group.getText().toString();
                            Intent NextPage = new Intent(MainActivity.this, DrawerActivity.class);
                            NextPage.putExtra("key",grupacurenta);
                            startActivity(NextPage);
                        }
                    })
                    .show();
    }
}