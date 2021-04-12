package com.example.katyramashay;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;

public class Shower {
    // instance methods
    private boolean completed;
    private Instant timeStamp;

    // constructors
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Shower(){
        completed = false;
        timeStamp = Instant.now();
    }

    //methods
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }
}
