package com.example.katyramashay;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static java.text.DateFormat.getDateInstance;

public class Day {
    private final ArrayList<Task> taskList;
    private final String dateStamp;

    public Day() {
        taskList = new ArrayList<>();
        dateStamp = new SimpleDateFormat("MMM dd, yyyy").format(getDateInstance());
    }

    public String getDate() {
        return dateStamp;
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public Task getTask(int index) {
        return taskList.get(index);
    }
}
