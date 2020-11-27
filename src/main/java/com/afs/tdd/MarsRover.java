package com.afs.tdd;

import command.MarsRoverCommand;

import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private String direction;
    private List<MarsRoverCommand> CommandList = new ArrayList<>();

    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void moveXPlusOne(){
        this.coordinateX++;
    }
    public void moveXMinusOne(){
        this.coordinateX--;
    }
    public void moveYPlusOne(){
        this.coordinateY++;
    }
    public void moveYMinusOne(){
        this.coordinateY--;
    }
    public void turnNorth(){
        this.direction = "N";
    }
    public void turnSouth(){
        this.direction = "S";
    }
    public void turnEast(){
        this.direction = "E";
    }
    public void turnWest(){
        this.direction = "W";
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public String getDirection() {
        return this.direction;
    }

    public void inputCommand(MarsRoverCommand command){
        CommandList.add(command);
    }


    public void inputCommands(List<MarsRoverCommand> commands){
        CommandList.addAll(commands);
    }

    public void executeCommands(){
        for (MarsRoverCommand command : CommandList) {
            command.execute();
        }
    }
}
