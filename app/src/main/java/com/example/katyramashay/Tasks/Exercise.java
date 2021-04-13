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
