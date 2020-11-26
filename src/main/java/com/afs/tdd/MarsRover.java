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
        if (instruction == 'L') {
            turnLeft();
        }
    }

    private void turnLeft() {
        if (this.direction.equals("N")) {
            this.direction = "W";
        } else if (this.direction.equals("S")) {
            this.direction = "E";

        }
    }

    private void move() {
        switch (direction) {
            case "N":
                this.coordinateY++;
                break;
            case "S":
                this.coordinateY--;
                break;
            case "E":
                this.coordinateX++;
                break;
            case "W":
                this.coordinateX--;
                break;
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
