package com.example.katyramashay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogEntry {
    // instance variables
    private String mentalHealth;
    private int physicalHealth;
    private String reason;
    private int painLevel;
    private String painLocation;
    private String additionalInfo;
    private String dateStamp;

    // constructors

    /**
     * default constructor initializing all integers to 0 and strings as empty aside from mentalHealth string ("neutral")
     */
    public LogEntry() {
        mentalHealth = "neutral";
        physicalHealth = 0;
        reason = "";
        painLevel = 0;
        painLocation = "";
        additionalInfo = "";
        dateStamp = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
    }

    public String getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(String mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public int getPhysicalHealth() {
        return physicalHealth;
    }

    public void setPhysicalHealth(int physicalHealth) {
        this.physicalHealth = physicalHealth;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public String getPainLocation() {
        return painLocation;
    }

    public void setPainLocation(String painLocation) {
        this.painLocation = painLocation;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * sets the date of the log entry added by the user
     * @param date the date that the log entry is added by the user as a String
     */
    public void setDate(String date) { dateStamp = date; }

    /**
     * returns the time stamp for the activity
     * @return the date that is stored in dataStamp
     */
    public String getDate() {
        return dateStamp;
    }
}
