package com.example.CuraeSuprema;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.CuraeSuprema.DataModelingClasses.Controller;
import com.example.CuraeSuprema.DataModelingClasses.Exercise;
import com.example.CuraeSuprema.DataModelingClasses.Meal;
import com.example.CuraeSuprema.DataModelingClasses.Shower;
import com.example.CuraeSuprema.DataModelingClasses.Sleep;
import com.example.CuraeSuprema.DataModelingClasses.Socialization;
import com.example.CuraeSuprema.DataModelingClasses.Task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class DailyTask extends AppCompatActivity {


    public static final int ADD_TASK_REQUEST = 1;
    public static final int EDIT_TASK_REQUEST = 2;
    public static final String EXTRA_ID = "EXTRA_ID";
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_task);
        getSupportActionBar().hide();
    }

    protected void onStart() {
        super.onStart();

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        tasks = controller.getDay(date).getTasks();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(tasks);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TextView dateText = findViewById(R.id.dateTitle);
        String dateTextStr = "Today is " + date;
        dateText.setText(dateTextStr);

        adapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {

            @Override
            public void onItemClick(Shower shower, int position) {


                Intent intent = new Intent(DailyTask.this, ShowerTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

            @Override
            public void onItemClick(Meal meal, int position) {
                Intent intent = new Intent(DailyTask.this, MealsTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

            @Override
            public void onItemClick(Sleep sleep, int position) {
                Intent intent = new Intent(DailyTask.this, SleepTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

            @Override
            public void onItemClick(Exercise exercise, int position) {
                Intent intent = new Intent(DailyTask.this, ExerciseTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

            @Override
            public void onItemClick(Socialization socialization, int position) {
                Intent intent = new Intent(DailyTask.this, SocialTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

            @Override
            public void onItemClick(Task task, int position) {
                Intent intent = new Intent(DailyTask.this, NewTask.class);
                intent.putExtra(EXTRA_ID, EDIT_TASK_REQUEST);
                intent.putExtra(EXTRA_POSITION, position);
                startActivityForResult(intent, EDIT_TASK_REQUEST);
            }

        });
    }

    public void onStop() {
        super.onStop();

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        controller.getDay(date).setTasks(tasks);
    }

    public void performTaskPage(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

    public void performLogEntry(View v) {
        Intent intent = new Intent(this, LogEntryPage.class);
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

    public void performSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}