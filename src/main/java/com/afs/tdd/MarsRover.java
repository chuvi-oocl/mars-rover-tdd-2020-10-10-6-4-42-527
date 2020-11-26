package com.afs.tdd;

public class MarsRover {
    private int coordinateX;
    private int coordinateY;
    private String direction;

    public MarsRover(int coordinateX, int coordinateY, String direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public void runInstructions(String instructions) {
        instructions.chars().mapToObj(instruction -> (char) instruction).forEach(this::runInstruction);
    }

    private void runInstruction(char instruction) {
        if (instruction == 'M') {
            move();
        }
    }

    private void move() {
        if (direction.equals("N")) {
            this.coordinateY++;
        }
        else if (direction.equals("S")){
            this.coordinateY--;
        }
    }

    public int getCoordinateX() {
        return this.coordinateX;
    }

    public int getCoordinateY() {
        return this.coordinateY;
    }

    public String getDirection() {
        return direction;
    }
}
