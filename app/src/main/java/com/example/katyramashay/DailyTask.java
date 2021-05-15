package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DailyTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

        TextView dateText = findViewById(R.id.dateTitle);
        String dateTextStr = "Today is " + date;
        dateText.setText(dateTextStr);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        adapter.setTasks(controller.getDay(date).getTasks());
        recyclerView.setAdapter(adapter);
    }

    public void performTaskPage(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

    public void performLogEntry(View v) {
        Intent intent = new Intent(this, LogEntry.class);
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