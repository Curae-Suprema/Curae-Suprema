package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Shower;
import com.example.katyramashay.DataModelingClasses.Task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NewTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Task task = new Task();
        task.setCompletion(true);

        EditText taskName = findViewById(R.id.nameOfTaskField);
        String name = taskName.getText().toString();
        task.setTaskName(name);

        EditText notesOfTask = findViewById(R.id.notesOfTaskField);
        String notes = notesOfTask.getText().toString();
        task.setNotes(notes);

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        controller.getDay(date).addTask(task);

    }

}