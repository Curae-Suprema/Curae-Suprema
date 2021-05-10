package com.example.katyramashay.DataModelingClasses;

/**
 * this class models the sleep quality of a patient
 */

public class Sleep extends Task {

    //DATA

    // quality of sleep is rated on a scale of 1-10
    private int quality;


    //CONSTRUCTOR

    /**
     * creates the default constructor by setting the quality
     * of sleep to the lowest rating
     */
    public Sleep() {
        super.setTaskName("Sleep");
        quality = 1;
    }


    //METHODS

    /**
     * gets the quality of sleep that the user had
     * @return sleep quality
     */
    public int getQuality() {
        return quality;
    }

    /**
     * sets the user's quality of sleep
     * @param quality quality on a scale of 1-10
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }

}
