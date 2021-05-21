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
    private ArrayList<Pilot> pilots;
    private CabinCrew cabinCrew_1;
    private CabinCrew cabinCrew_2;
    private CabinCrew cabinCrew_3;
    private CabinCrew cabinCrew_4;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;


    @Before
    public void before(){
        pilot_1 = new Pilot("Bruce Dickinson", Rank.CAPITAN, "BB674985X");
        pilot_2 = new Pilot("Bob Marley", Rank.FIRST_OFFICER, "AD667453U");
        pilots = new ArrayList<>();
        pilots.add(pilot_1);
        pilots.add(pilot_2);
        cabinCrew_1 = new CabinCrew("Mike Tyson", Rank.FLIGHT_ATTENDANT);
        cabinCrew_2 = new CabinCrew("Lennox Lewis", Rank.FLIGHT_ATTENDANT);
        cabinCrew_3 = new CabinCrew("Jon Jones", Rank.FLIGHT_ATTENDANT);
        cabinCrew_4 = new CabinCrew("Jan Blachowicz", Rank.FLIGHT_ATTENDANT);
        cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrew_1);
        cabinCrew.add(cabinCrew_2);
        cabinCrew.add(cabinCrew_3);
        cabinCrew.add(cabinCrew_4);
        plane = new Plane(PlaneType.BOEING747);
        flight_1 = new Flight(pilots, cabinCrew, plane, "ABZ65892", "Aberdeen", "Edinburgh", "14:55");
    }

    @Test
    public void flightHasPilots(){
        assertEquals(2, flight_1.getNumberOfPilots());
    }

}