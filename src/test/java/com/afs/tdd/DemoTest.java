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
    
    @Test
    void should_parking_boy_call_parking_lot_park_function_once_when_park_the_car_given_call_parking_boy_park_function(){
    
        //given
        ParkingLot parkingLot = Mockito.mock(ParkingLot.class);
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        //when
        parkingBoy.park(car);
        //then
        verify(parkingLot, times(1)).park(car);
    }
    @Test
    void should_return_a_parking_ticket_when_park_the_car_given_a_car_and_parking_lot(){
        //given
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();
        //when
        final Ticket ticket = parkingLot.park(car);
        //then
        assertNotNull(ticket);
    }
    @Test
    void should_only_one_car_parked_when_park_multiple_cars_given_parking_lot_with_1_capacity(){
        //given
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        //when
        final Ticket ticket1 = parkingLot.park(car1);
        final Ticket ticket2 = parkingLot.park(car2);
        //then
        assertNotNull(ticket1);
        assertNull(ticket2);
    }
    @Test
    void should_return_car_when_fetch_car_given_parking_ticket_parking_lot_that_parked_the_car(){
        //given
        Car car1 = new Car();
        Car car2 = new Car();
        ParkingLot parkingLot = new ParkingLot();
        //when
        final Ticket ticket1 = parkingLot.park(car1);
        final Ticket ticket2 = parkingLot.park(car2);
        //then
        assertNotNull(ticket1);
        assertNull(ticket2);
    }

}
