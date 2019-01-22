package com.example.android.tflitecamerademo;

public class KeyPoint {
    public int x;
    public int y;
    public float confidence;

    KeyPoint(int x, int y, float confidence) {
        this.x = x;
        this.y = y;
        this.confidence = confidence;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %.3f)", this.x, this.y, this.confidence);
    }
}
