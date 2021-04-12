package com.example.katyramashay.Tasks;

import java.util.Calendar;

public class Task {
    // instance variables

    private String taskName;
    private boolean completion;
    private Calendar reminder;
    private String notes;

    // constructor

    public Task() {
        taskName = "";
        completion = false;
        reminder = Calendar.getInstance();
        notes = "";
    }

    // methods

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String newName) {
        taskName = newName;
    }

    public boolean getCompletion() {
        return completion;
    }

    public void setCompletion(boolean b) {
        completion = b;
    }

    public Calendar getReminder() {
        return reminder;
    }

    public void setReminder(int hour, int minute) {
        reminder.set(Calendar.HOUR_OF_DAY, hour);
        reminder.set(Calendar.MINUTE, minute);
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String newNotes) {
        notes = newNotes;
    }
}
