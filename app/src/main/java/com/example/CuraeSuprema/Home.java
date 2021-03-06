package com.example.CuraeSuprema;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.example.CuraeSuprema.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        int percent = controller.getDay(date).getCompletionPercentage();

        TextView welcomeText = findViewById(R.id.welcomeHomePage);
        if (!controller.getFirstName().equals("")) {
            String welcomeTextStr = "Welcome, " + controller.getFirstName() + "!";
            welcomeText.setText(welcomeTextStr);
        }

        TextView dateText = findViewById(R.id.dateHomePage);
        String dateTextStr = "Today is " + date;
        dateText.setText(dateTextStr);

        TextView completionText = findViewById(R.id.completionHomePage);
        String completionTextStr = "You have completed " + percent + "% of today's tasks";
        completionText.setText(completionTextStr);

        TextView completionPercentage = findViewById(R.id.completionPercentage);
        String completionPercentageStr = percent + "%";
        completionPercentage.setText(completionPercentageStr);

        ProgressBar completionCircle = findViewById(R.id.completionCircle);
        completionCircle.setProgress(percent);
    }

    public void performDailyTask(View v) {
        Intent intent = new Intent(this, DailyTask.class);
        startActivity(intent);
    }

    public void performTaskPage(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

    public void performLogEntry(View v) {
        Intent intent = new Intent(this, LogEntryPage.class);
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

    public void performSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}