package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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

        Toast.makeText(getApplicationContext(), "Click on the progress circle to view all your tasks for today!", Toast.LENGTH_SHORT).show();
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