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
        } else if (instruction == 'L') {
            turnLeft();
        } else if (instruction == 'R') {
            turnRight();
        }
    }

    private void turnRight() {
        if (this.direction.equals("N")) {
            this.direction = "E";
        } else if (this.direction.equals("S")) {
            this.direction = "W";
        }
    }

    private void turnLeft() {
        switch (this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
            case "W":
                this.direction = "S";
                break;
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
