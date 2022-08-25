package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class PaintCalculator {
    private List<Room> roomList = new ArrayList<>();
    public void addRoom(double length, double width, double height){
        Room newRoom = new Room(length, width, height);
        roomList.add(newRoom);
    }
    public String toString(){
        if(roomList != null){
            return roomList.toString();
        }else{
            return "No rooms yet";
        }
    }
}
