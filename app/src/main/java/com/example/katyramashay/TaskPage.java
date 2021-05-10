package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Shower;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.getDateInstance;

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
    final Controller aController = (Controller) getApplicationContext();

    public void logShowerTask() {
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        aController.getDay(date).getTask(aController.getDay(date).getTasks().indexOf("Shower")).setCompletion(true);
    }

    public void logMealTask() {
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        aController.getDay(date).getTask(aController.getDay(date).getTasks().indexOf("Meal")).setCompletion(true);
    }

    public void logSleepTask() {
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        aController.getDay(date).getTask(aController.getDay(date).getTasks().indexOf("Sleep")).setCompletion(true);
    }
    public void logExerciseTask() {
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        aController.getDay(date).getTask(aController.getDay(date).getTasks().indexOf("Exercise")).setCompletion(true);
    }

    public void logSocializationTask() {
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        aController.getDay(date).getTask(aController.getDay(date).getTasks().indexOf("Socialization")).setCompletion(true);
    }
}