package com.example.katyramashay.Tasks;

public class Sleep extends Task {

    private int quality; // scale from 1 to 10?

    public Sleep() {
        quality = 0;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

}
