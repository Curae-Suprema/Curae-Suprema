package com.example.katyramashay.DataModelingClasses;

/**
 * this class models the tasks that a patient completes in a day
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task {

    //DATA
    private String taskName;
    private boolean completion;
    private Calendar reminder;
    private String notes;
    private int lengthMin;
    private int lengthHours;


    //CONSTRUCTORS

    /**
     * creates the default constructor by setting strings as empty,
     * booleans to false, ints to 0, and the date to a default day
     */
    public Task() {
        taskName = "";
        completion = false;
        reminder = Calendar.getInstance();
        notes = "";
        lengthMin = 0;
        lengthHours = 0;
    }


    //METHODS

    /**
     * gets the name of the task
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * sets the name of the task
     * @param newName the name of the new task
     */
    public void setTaskName(String newName) {
        taskName = newName;
    }

    /**
     * gets the value of the boolean to determine whether or not the task was completed
     * @return completion
     */
    public boolean getCompletion() {
        return completion;
    }

    /**
     * sets the completion status to a user-specified value
     * @param b user-specified completion
     */
    public void setCompletion(boolean b) {
        completion = b;
    }

    /**
     * gets the date of the reminder for the task
     * @return the reminder date/time
     */
    public String getReminder() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
        return sdf.format(reminder);
    }

    /**
     * sets the reminder to a certain time of day
     * @param hour the hour value of the reminder
     * @param minute the minute value of the reminder
     */
    public void setReminder(int hour, int minute) {
        reminder.set(Calendar.HOUR_OF_DAY, hour);
        reminder.set(Calendar.MINUTE, minute);
    }

    /**
     * gets any notes that the user made about the task
     * @return user's notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * sets notes to the user-specified notes
     * @param newNotes the notes the user makes
     */
    public void setNotes(String newNotes) {
        notes = newNotes;
    }

    /**
     * gets the length of the task in minutes
     * @return the length of the task in minutes
     */
    public int getLengthMin() {
        return lengthMin;
    }

    /**
     * sets the length of the task to a certain number of minutes
     * @param min user-specified number of minutes
     */
    public void setLengthMin(int min) {
        double n = min / 60.0;
        if (min >= 60)
            lengthHours += min / 60;
        lengthMin = min % 60;
    }

    /**
     * gets the length of the task in hours
     * @return the length of the task in hours
     */
    public int getLengthHours() {
        return lengthHours;
    }

    /**
     * sets the length of the tasks to a certain number of hours
     * @param hours user-specified number of hours
     */
    public void setLengthHours(int hours) {
        lengthHours = hours;
    }
}
