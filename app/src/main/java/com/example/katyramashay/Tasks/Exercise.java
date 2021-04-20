package com.example.katyramashay.Tasks;

/**
 * this class models the behavior of the exercise a patient completes
 */

public class Exercise extends Task {

    //DATA
    private String type;


    //CONSTRUCTOR

    /**
     * creates the default constructor where type is
     * assigned to an empty string
     */
    public Exercise() {
        type = "";
    }


    //METHODS

    /**
     * returns the kind of exercise that the user completed for that day
     * @return the type of exercise completed
     */
    public String getType() {
        return type;
    }

    /**
     * sets the kind of exercise to a user specified type
     * @param type the type of exercise the user completed that day
     */
    public void setType(String type) {
        this.type = type;
    }

}
