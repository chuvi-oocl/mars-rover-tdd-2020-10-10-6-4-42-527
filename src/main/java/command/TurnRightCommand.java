package command;

import com.afs.tdd.MarsRover;

public class TurnRightCommand implements MarsRoverCommand{
    private MarsRover marsRover;

    public TurnRightCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }
    @Override
    public void execute(){
        switch (marsRover.getDirection()) {
            case "N":
                marsRover.turnEast();
                break;
            case "S":
                marsRover.turnWest();
                break;
            case "E":
                marsRover.turnSouth();
                break;
            case "W":
                marsRover.turnNorth();
                break;
        }
    }
}
