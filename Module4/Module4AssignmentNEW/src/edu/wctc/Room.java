package edu.wctc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private final List<Wall> wallList = new ArrayList<>();

    public Room(double width, double length, double height) {
        Wall wall1 = new Wall(width, height);
        Wall wall2 = new Wall(width, height);
        Wall wall3 = new Wall(length, height);
        Wall wall4 = new Wall(length, height);
        wallList.add(wall1);
        wallList.add(wall2);
        wallList.add(wall3);
        wallList.add(wall4);
    }

    public double getArea() {
        return wallList.indexOf(0) * wallList.indexOf(1);
    }

    @Override
    public String toString() {
        return (Double.toString(getArea()));
    }
}
