package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SleepTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText sleepQuality = findViewById(R.id.sleepQuality);
        String sleepQualityStr = sleepQuality.getText().toString();

        EditText sleepDuration = findViewById(R.id.duration);
        String sleepDurationStr = sleepDuration.getText().toString();

        EditText addComments = findViewById(R.id.addComments);
        String comments = addComments.getText().toString();

        if (!sleepQualityStr.isEmpty() || !sleepDurationStr.isEmpty() || !comments.isEmpty()) {
            Sleep sleep = new Sleep();

            sleep.setQuality(sleepQualityStr);
            sleep.setDuration(sleepDurationStr);
            sleep.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(sleep);
        }
    }
}