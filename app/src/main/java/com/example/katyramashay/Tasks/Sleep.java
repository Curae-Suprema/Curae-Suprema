package com.example.katyramashay.Tasks;

public class Sleep extends Task {

    private int quality; // scale from 1 to 10
    private int lengthMin;
    private int lengthHours;

    public Sleep() {
        quality = 0;
        lengthMin = 0;
        lengthHours = 0;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
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
