package flightsTests;

import aircrafts.Plane;
import aircrafts.PlaneType;
import flights.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;
import people.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight_1;
    private Pilot pilot_1;
    private Pilot pilot_2;
    private Pilot pilot_3;
    private ArrayList<Pilot> pilots;
    private CabinCrew cabinCrew_1;
    private CabinCrew cabinCrew_2;
    private CabinCrew cabinCrew_3;
    private CabinCrew cabinCrew_4;
    private CabinCrew cabinCrew_5;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane_1;
    private Plane plane_2;
    private Passenger passenger_1;
    private Passenger passenger_2;


    @Before
    public void before(){
        pilot_1 = new Pilot("Bruce Dickinson", Rank.CAPITAN, "BB674985X");
        pilot_2 = new Pilot("Bob Marley", Rank.FIRST_OFFICER, "AD667453U");
        pilot_3 = new Pilot("Evander Holyfield", Rank.FIRST_OFFICER, "GD367983J");
        pilots = new ArrayList<>();
        pilots.add(pilot_1);
        pilots.add(pilot_2);
        cabinCrew_1 = new CabinCrew("Mike Tyson", Rank.FLIGHT_ATTENDANT);
        cabinCrew_2 = new CabinCrew("Lennox Lewis", Rank.FLIGHT_ATTENDANT);
        cabinCrew_3 = new CabinCrew("Jon Jones", Rank.FLIGHT_ATTENDANT);
        cabinCrew_4 = new CabinCrew("Jan Blachowicz", Rank.FLIGHT_ATTENDANT);
        cabinCrew_5 = new CabinCrew("Emma Watson", Rank.FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrew_1);
        cabinCrew.add(cabinCrew_2);
        cabinCrew.add(cabinCrew_3);
        cabinCrew.add(cabinCrew_4);
        plane_1 = new Plane(PlaneType.BOEING747);
        plane_2 = new Plane(PlaneType.AIRBUSA320);
        passenger_1 = new Passenger("Jimi Hendrix", 1);
        passenger_2 = new Passenger("Elton John", 2);
        flight_1 = new Flight(pilots, cabinCrew, plane_1, "ABZ65892", "Aberdeen", "Edinburgh", "14:55");
    }

    @Test
    public void flightHasPilots(){
        assertEquals(2, flight_1.getNumberOfPilots());
    }

    @Test
    public void canAddPilotToPilots(){
        flight_1.addPilotToPilotsOnThisFlight(pilot_3);
        assertEquals(3, flight_1.getNumberOfPilots());
    }

    @Test
    public void canDeleteParticularPilotFromThisFlight(){
        flight_1.deletePilotFromPilotsOnThisFlight(pilot_1);
        assertEquals(1, flight_1.getNumberOfPilots());
    }

    @Test
    public void flightHasCabinCrew(){
        assertEquals(4, flight_1.getNumberOfCabinCrew());
    }

    @Test
    public void canAddCabinCrewMemberToCabinCrewOnThisFlight(){
        flight_1.addCabinCrewMemberToCabinCrewOnThisFlight(cabinCrew_5);
        assertEquals(5, flight_1.getNumberOfCabinCrew());
    }

    @Test
    public void canDeleteParticularCabinCrewMemberFromThisFlight(){
        flight_1.deleteCabinCrewMemberFromCabinCrewOnThisFlight(cabinCrew_5);
        assertEquals(4, flight_1.getNumberOfCabinCrew());
    }

    @Test
    public void canGetPassengersCount(){
        assertEquals(0,flight_1.getPassengersCount());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight_1.addPassengerToFlight(passenger_1);
        assertEquals(1, flight_1.getPassengersCount());
    }
    @Test
    public void canRemoveParticularPassengerFromFlight(){
        flight_1.addPassengerToFlight(passenger_1);
        flight_1.removePassengerFromFlight(passenger_1);
        assertEquals(0, flight_1.getPassengersCount());
    }

    @Test
    public void canRemoveAllPassengersIfFlightCancelled(){
        flight_1.addPassengerToFlight(passenger_1);
        flight_1.addPassengerToFlight(passenger_2);
        flight_1.removeAllPassengersIfFlightCancelled();
        assertEquals(0, flight_1.getPassengersCount());
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.BOEING747, flight_1.getPlane().getPlaneType());
    }

    @Test
    public void canChangePlane() {
        flight_1.setPlane(plane_2);
        assertEquals(PlaneType.AIRBUSA320, flight_1.getPlane().getPlaneType());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("ABZ65892", flight_1.getFlightNumber());
    }
}
