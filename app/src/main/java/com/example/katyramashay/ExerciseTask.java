package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Exercise;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ExerciseTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText exerciseType = findViewById(R.id.exerciseType);
        String exerciseTypeStr = exerciseType.getText().toString();

        if (!exerciseTypeStr.isEmpty()) {
            Exercise exercise = new Exercise();

            exercise.setType(exerciseTypeStr);

            EditText addComments = findViewById(R.id.addComments);
            String comments = addComments.getText().toString();
            exercise.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(exercise);
        }
    }
}