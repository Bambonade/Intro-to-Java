package edu.wctc;

public class Piano {
    public Key currentKey;

    public void setCurrentKey(Key key) {
        currentKey = key;
    }

    public String playCurrentKey() {
        return currentKey.toString();
    }

    public void goLeft() {
        if (currentKey.getLeft() != null)
            currentKey = currentKey.getLeft();
    }

    public void goRight() {
        if (currentKey.getRight() != null)
            currentKey = currentKey.getRight();
    }
}
