package com.example.katyramashay.Tasks;

import java.util.Calendar;

public class Task {

    private String taskName;
    private boolean completion;
    private Calendar reminder;
    private String notes;
    private int lengthMin;
    private int lengthHours;

    public Task() {
        taskName = "";
        completion = false;
        reminder = Calendar.getInstance();
        notes = "";
        lengthMin = 0;
        lengthHours = 0;
    }

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

    public int getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(int min) {
        double n = min / 60.0;
        if (min >= 60)
            lengthHours += min / 60;
        lengthMin = min % 60;
    }

    public int getLengthHours() {
        return lengthHours;
    }

    public void setLengthHours(int hours) {
        lengthHours = hours;
    }
}
