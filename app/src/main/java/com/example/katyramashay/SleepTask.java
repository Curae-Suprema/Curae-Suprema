package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Sleep;
import com.example.katyramashay.DataModelingClasses.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import static com.example.katyramashay.DailyTask.EXTRA_ID;
import static com.example.katyramashay.DailyTask.EXTRA_POSITION;

public class SleepTask extends AppCompatActivity {

    private Sleep sleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_task);
        getSupportActionBar().hide();

        EditText sleepQuality = findViewById(R.id.sleepQuality);
        EditText sleepDuration = findViewById(R.id.duration);
        EditText addComments = findViewById(R.id.addComments);

        sleep = new Sleep();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            sleep = (Sleep) tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            sleepQuality.setText(sleep.getQuality());
            sleepDuration.setText(sleep.getDuration());
            addComments.setText(sleep.getNotes());
        }

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

            sleep.setQuality(sleepQualityStr);
            sleep.setDuration(sleepDurationStr);
            sleep.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(sleep, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(sleep);
        }
    }
}