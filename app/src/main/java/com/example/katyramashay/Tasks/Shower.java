package com.example.katyramashay.Tasks;


public class Shower extends Task {

    // instance variables
    private int length;
    private int temperature;

    // constructors
    public Shower() {
        length = 0;
        temperature = 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

}
