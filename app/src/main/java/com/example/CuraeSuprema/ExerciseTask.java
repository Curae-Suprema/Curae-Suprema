package com.example.CuraeSuprema;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.CuraeSuprema.DataModelingClasses.Controller;
import com.example.CuraeSuprema.DataModelingClasses.Exercise;
import com.example.CuraeSuprema.DataModelingClasses.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import static com.example.CuraeSuprema.DailyTask.EXTRA_ID;
import static com.example.CuraeSuprema.DailyTask.EXTRA_POSITION;

public class ExerciseTask extends AppCompatActivity {

    private Exercise exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_task);
        getSupportActionBar().hide();

        EditText exerciseType = findViewById(R.id.exerciseType);
        EditText addComments = findViewById(R.id.addComments);
        TimePicker timepicker = findViewById(R.id.exerciseTimePicker);
        CheckBox exerciseCompletedButton = findViewById(R.id.exerciseCompletedButton);

        exercise = new Exercise();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            exercise = (Exercise) tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            exerciseType.setText(exercise.getType());
            addComments.setText(exercise.getNotes());
            timepicker.setCurrentHour(exercise.getHour());
            timepicker.setCurrentMinute(exercise.getMinute());
            exerciseCompletedButton.setChecked(exercise.getCompletion());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText exerciseType = findViewById(R.id.exerciseType);
        String exerciseTypeStr = exerciseType.getText().toString();

        EditText addComments = findViewById(R.id.addComments);
        String comments = addComments.getText().toString();

        TimePicker timepicker = findViewById(R.id.exerciseTimePicker);

        int hour = timepicker.getCurrentHour();
        int minute = timepicker.getCurrentMinute();

        if (!exerciseTypeStr.isEmpty() || !comments.isEmpty()) {

            exercise.setType(exerciseTypeStr);
            exercise.setNotes(comments);
            exercise.setReminder(hour, minute);

            CheckBox exerciseCompletedButton = findViewById(R.id.exerciseCompletedButton);
            exercise.setCompletion(exerciseCompletedButton.isChecked());

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(exercise, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(exercise);
        }
    }
}