package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_return_0_1_N_when_run_instructions_given_0_0_N_M() {

        //given
        String instructions = "M";
        MarsRover marsRover = new MarsRover(0, 0, "N");
        //when
        marsRover.runInstructions(instructions);
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), 1);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    void should_return_0_1_N_when_run_instructions_given_0_0_S_M() {

        //given
        String instructions = "M";
        MarsRover marsRover = new MarsRover(0, 0, "S");
        //when
        marsRover.runInstructions(instructions);
        //then
        assertEquals(marsRover.getCoordinateX(), 0);
        assertEquals(marsRover.getCoordinateY(), -1);
        assertEquals(marsRover.getDirection(), "S");
    }

    @Test
    void should_return_0_1_N_when_run_instructions_given_0_0_E_M() {

        //given
        String instructions = "M";
        MarsRover marsRover = new MarsRover(0, 0, "E");
        //when
        marsRover.runInstructions(instructions);
        //then
        assertEquals(marsRover.getCoordinateX(), 1);
        assertEquals(marsRover.getCoordinateY(), 0);
        assertEquals(marsRover.getDirection(), "E");
    }
}
