package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import static java.text.DateFormat.getDateInstance;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Controller controller = (Controller) getApplicationContext();

        TextView welcomeText = findViewById(R.id.welcomeHomePage);
        String welcomeTextStr = "Welcome, " + controller.getFirstName() + "!";
        welcomeText.setText(welcomeTextStr);

        TextView dateText = findViewById(R.id.dateHomePage);
        String dateTextStr = "Today is " + new SimpleDateFormat("Www, Mmm dd, yyyy").format(getDateInstance());
        dateText.setText(dateTextStr);

        TextView completionText = findViewById(R.id.completionHomePage);
        String completionTextStr = "You have completed " + controller.getDay(new SimpleDateFormat("MMM dd, yyyy").format(getDateInstance())).getCompletionPercentage() + "% of your tasks today!";
        completionText.setText(completionTextStr);

        TextView completionPercentage = findViewById(R.id.completionPercentage);
        String completionPercentageStr = controller.getDay(new SimpleDateFormat("MMM dd, yyyy").format(getDateInstance())).getCompletionPercentage() + "%";
        completionPercentage.setText(completionPercentageStr);

    }
}