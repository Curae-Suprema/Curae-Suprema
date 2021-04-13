package com.example.katyramashay.Tasks;

public class Exercise extends Task {

    private String type;
    private int lengthMin;
    private int lengthHours;

    public Exercise() {
        type = "";
        lengthMin = 0;
        lengthHours = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLengthMin() {
        return lengthMin;
    }

    public void setLengthMin(int min) {
        lengthMin = min;
    }

    public int getLengthHours() {
        return lengthHours;
    }

    public void setLengthHours(int hours) {
        lengthHours = hours;
    }

}
