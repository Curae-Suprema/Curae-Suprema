package com.example.katyramashay.Tasks;

/**
 * this class models whether or not the patient took a shower
 */

public class Shower extends Task {

    //DATA
    private boolean completion;


    //CONSTRUCTOR

    /**
     * creates the default constructor and sets completion to false
     */
    public Shower() {
        completion = false;
    }


    //METHODS

    /**
     * gets whether or not the user took a shower
     * @return the completion status
     */
    public boolean getCompletion() {
        return completion;
    }

    /**
     * sets the shower completion to a user-specified status
     * @param completion whether or not a shower was taken
     */
    public void setCompletion(boolean completion) {
        this.completion = completion;
    }

}
