package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TaskPage extends AppCompatActivity {

    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_page);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStart() {
        super.onStart();
        date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

        final Controller controller = (Controller) getApplicationContext();
    }

    public void performShower(View v) {
        Intent intent = new Intent(this, ShowerTask.class);
        startActivity(intent);
    }

    public void performMeals(View v) {
        Intent intent = new Intent(this, MealsTask.class);
        startActivity(intent);
    }

    public void performSleep(View v) {
        Intent intent = new Intent(this, SleepTask.class);
        startActivity(intent);
    }

    public void performExercise(View v) {
        Intent intent = new Intent(this, ExerciseTask.class);
        startActivity(intent);
    }

    public void performPeople(View v) {
        Intent intent = new Intent(this, SocialTask.class);
        startActivity(intent);
    }

    public void performNewTask(View v) {
        Intent intent = new Intent(this, NewTask.class);
        startActivity(intent);
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