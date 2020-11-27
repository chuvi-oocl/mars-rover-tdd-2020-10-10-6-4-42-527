package com.afs.tdd;

import command.MarsRoverCommand;
import command.MoveCommand;
import command.TurnLeftCommand;
import command.TurnRightCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_run_instructions_given_0_0_N_M() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.inputCommand(new MoveCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 1);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    void should_return_0_negative1_S_when_run_instructions_given_0_0_S_M() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.inputCommand(new MoveCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), -1);
        assertEquals(marsRover.getDirection(), "S");
    }

    @Test
    void should_return_1_0_N_when_run_instructions_given_0_0_E_M() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.inputCommand(new MoveCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 1);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "E");
    }

    @Test
    void should_return_negative1_0_W_when_run_instructions_given_0_0_W_M() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.inputCommand(new MoveCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), -1);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "W");
    }

    @Test
    void should_return_0_0_W_when_run_instructions_given_0_0_N_L() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.inputCommand(new TurnLeftCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "W");
    }

    @Test
    void should_return_0_0_E_when_run_instructions_given_0_0_S_L() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.inputCommand(new TurnLeftCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "E");
    }

    @Test
    void should_return_0_0_N_when_run_instructions_given_0_0_E_L() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.inputCommand(new TurnLeftCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    void should_return_0_0_S_when_run_instructions_given_0_0_W_L() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.inputCommand(new TurnLeftCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "S");
    }


    @Test
    void should_return_0_0_E_when_run_instructions_given_0_0_N_R() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.inputCommand(new TurnRightCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "E");
    }

    @Test
    void should_return_0_0_W_when_run_instructions_given_0_0_S_R() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.inputCommand(new TurnRightCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "W");
    }

    @Test
    void should_return_0_0_S_when_run_instructions_given_0_0_E_R() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.inputCommand(new TurnRightCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "S");
    }

    @Test
    void should_return_0_0_N_when_run_instructions_given_0_0_W_R() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.inputCommand(new TurnRightCommand(marsRover));
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "N");
    }
    @Test
    void should_return_0_1_E_when_run_instructions_given_0_0_N_MR() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        List<MarsRoverCommand> commands = new ArrayList<>();
        commands.add(new MoveCommand(marsRover));
        commands.add(new TurnRightCommand(marsRover));
        marsRover.inputCommands(commands);
        //when
        marsRover.executeCommands();
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 1);
        assertEquals(marsRover.getDirection(), "E");
    }
}
