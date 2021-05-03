package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
    }

    public void performBack(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

}