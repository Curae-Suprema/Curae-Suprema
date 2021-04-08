package com.example.katyramashay;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalTime;

public class Task {
    // instance variables

    private String taskName;
    private LocalTime time;
    private boolean completion;
    private LocalTime reminder;
    private String notes;

    // constructor

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Task() {
        taskName = "";
        time = LocalTime.of(0,0);
        completion = false;
        reminder = LocalTime.of(0,0);
        notes = "";
    }

    // methods

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String newName) {
        taskName = newName;
    }

    public LocalTime getTime() {
        return time;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void setTime(int hour, int minute) {
        time = LocalTime.of(hour, minute);
    }

    public boolean getCompletion() {
        return completion;
    }
    public void setCompletion(boolean b) {
        completion = b;
    }

    public LocalTime getReminder() {
        return reminder;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void setReminder(int hour, int minute) {
        reminder = LocalTime.of(hour, minute);
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String newNotes) {
        notes = newNotes;
    }
}
