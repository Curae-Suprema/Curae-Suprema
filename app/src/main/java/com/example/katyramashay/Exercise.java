package com.example.katyramashay;

public class Exercise extends Task {

    private String type;
    private int length;

    public Exercise() {
        type = "";
        length = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
