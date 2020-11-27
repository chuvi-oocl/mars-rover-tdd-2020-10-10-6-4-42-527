package command;

import com.afs.tdd.MarsRover;

public class MoveCommand implements MarsRoverCommand{
    private MarsRover marsRover;

    public MoveCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        switch (marsRover.getDirection()) {
            case "N":
                marsRover.moveYPlusOne();
                break;
            case "S":
                marsRover.moveYMinusOne();
                break;
            case "E":
                marsRover.moveXPlusOne();
                break;
            case "W":
                marsRover.moveXMinusOne();
                break;
        }
    }
}
