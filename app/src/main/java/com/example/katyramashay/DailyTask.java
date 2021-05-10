package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.example.katyramashay.DataModelingClasses.Controller;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.text.DateFormat.getDateInstance;

public class DailyTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_task);

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US).format(getDateInstance());

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        adapter.setTasks(controller.getDay(date).getTasks());
        recyclerView.setAdapter(adapter);
    }
}