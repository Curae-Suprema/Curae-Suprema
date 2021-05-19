package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import static com.example.katyramashay.DailyTask.EXTRA_ID;
import static com.example.katyramashay.DailyTask.EXTRA_POSITION;

public class NewTask extends AppCompatActivity {

    private Task task;
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private static final String TAG = "NewTask";
    int year;
    int month;
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        getSupportActionBar().hide();
        mDisplayDate = (TextView) findViewById(R.id.dateOfTaskField);

        mDisplayDate.setOnClickListener(v -> {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(
                    NewTask.this,
                    android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                    mDateSetListener,
                    year,month,day);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        });

        mDateSetListener = (datePicker, yr, m, d) -> {
            month = m + 1;
            year = yr;
            day = d;
            Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);
            String date = month + "/" + day + "/" + year;
            mDisplayDate.setText(date);
        };

        EditText nameOfTaskField = findViewById(R.id.nameOfTaskField);
        CheckBox newTaskCompletedButton = findViewById(R.id.newTaskCompletedButton);
        EditText notesOfTaskField = findViewById(R.id.notesOfTaskField);

        task = new Task();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            task = tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            nameOfTaskField.setText(task.getTaskName());
            newTaskCompletedButton.setChecked(task.getCompletion());
            notesOfTaskField.setText(task.getNotes());
        }
    }


    @Override
    protected void onStop() {
        super.onStop();

        Task task = new Task();

        EditText nameOfTaskField = findViewById(R.id.nameOfTaskField);
        String name = nameOfTaskField.getText().toString();

        CheckBox newTaskCompletedButton = findViewById(R.id.newTaskCompletedButton);

        EditText notesOfTaskField = findViewById(R.id.notesOfTaskField);
        String notes = notesOfTaskField.getText().toString();

        if (newTaskCompletedButton.isChecked() || !name.isEmpty() || !notes.isEmpty()) {

            task.setTaskName(name);
            task.setCompletion(newTaskCompletedButton.isChecked());
            task.setNotes(notes);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(task, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(task);
        }
    }
}