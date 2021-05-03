package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TaskPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_page);
    }

    public void performTaskPage(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

    public void performDailyLog(View v) {
        Intent intent = new Intent(this, DailyTask.class);
        startActivity(intent);
    }

    public void performHome(View v) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void performMedications(View v) {
        Intent intent = new Intent(this, Medications.class);
        startActivity(intent);
    }
}