package command;

import com.afs.tdd.MarsRover;

public class TurnLeftCommand implements MarsRoverCommand{
    private MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }
    @Override
    public void execute(){
        switch (marsRover.getDirection()) {
            case "N":
                marsRover.turnWest();
                break;
            case "S":
                marsRover.turnEast();
                break;
            case "E":
                marsRover.turnNorth();
                break;
            case "W":
                marsRover.turnSouth();
                break;
        }
    }
}
