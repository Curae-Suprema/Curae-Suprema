package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.text.DateFormat.getDateInstance;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Controller controller = (Controller) getApplicationContext();

        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());
        int percent = controller.getDay(date).getCompletionPercentage();

        TextView welcomeText = findViewById(R.id.welcomeHomePage);
        String welcomeTextStr = "Welcome, " + controller.getFirstName() + "!";
        welcomeText.setText(welcomeTextStr);

        TextView dateText = findViewById(R.id.dateHomePage);
        String dateTextStr = "Today is " + date;
        dateText.setText(dateTextStr);

        TextView completionText = findViewById(R.id.completionHomePage);
        String completionTextStr = "You have completed " + percent + "% of your tasks today!";
        completionText.setText(completionTextStr);

        TextView completionPercentage = findViewById(R.id.completionPercentage);
        String completionPercentageStr = percent + "%";
        completionPercentage.setText(completionPercentageStr);

        ProgressBar completionCircle = findViewById(R.id.completionCircle);
        completionCircle.setProgress(percent);

    }
}