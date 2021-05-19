package com.example.CuraeSuprema.DataModelingClasses;

/**
 * this class models the sleep quality of a patient
 */

public class Sleep extends Task {

    private String quality;
    private String duration;

    /**
     * creates the default constructor by setting the quality
     * of sleep to the lowest rating
     */
    public Sleep() {
        super.setTaskName("Sleep");
        quality = "";
        duration = "";
    }

    /**
     * gets the quality of sleep that the user had
     * @return sleep quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * sets the user's quality of sleep
     * @param quality quality on a scale of 1-10
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDuration() { return duration; }

    public void setDuration(String duration) { this.duration = duration; }

}
