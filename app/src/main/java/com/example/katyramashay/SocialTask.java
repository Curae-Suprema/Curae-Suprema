package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Socialization;
import com.example.katyramashay.DataModelingClasses.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import static com.example.katyramashay.DailyTask.EXTRA_ID;
import static com.example.katyramashay.DailyTask.EXTRA_POSITION;

public class SocialTask extends AppCompatActivity {

    private Socialization socialization;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socials_task);
        getSupportActionBar().hide();

        EditText socialType = findViewById(R.id.socialType);
        EditText socialNames = findViewById(R.id.socialNames);
        EditText addComments = findViewById(R.id.addComments);
        TimePicker timepicker = findViewById(R.id.socialTimePicker);
        CheckBox socializationCompletedButton2 = findViewById(R.id.exerciseCompletedButton2);

        socialization = new Socialization();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            socialization = (Socialization) tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            socialType.setText(socialization.getActivity());
            socialNames.setText(socialization.getPeople());
            addComments.setText(socialization.getNotes());
            timepicker.setCurrentHour(socialization.getHour());
            timepicker.setCurrentMinute(socialization.getMinute());
            socializationCompletedButton2.setChecked(socialization.getCompletion());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText socialType = findViewById(R.id.socialType);
        String socialTypeStr = socialType.getText().toString();

        EditText socialNames = findViewById(R.id.socialNames);
        String socialNamesStr = socialNames.getText().toString();

        EditText addComments = findViewById(R.id.addComments);
        String comments = addComments.getText().toString();

        if (!socialTypeStr.isEmpty() || !socialNamesStr.isEmpty() || !comments.isEmpty()) {

            socialization.setActivity(socialTypeStr);
            socialization.setPeople(socialNamesStr);
            socialization.setNotes(comments);

            CheckBox exerciseCompletedButton2 = findViewById(R.id.exerciseCompletedButton2);
            socialization.setCompletion(exerciseCompletedButton2.isChecked());

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(socialization, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(socialization);
        }
    }
}