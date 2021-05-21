package flights;

import aircrafts.Plane;
import people.CabinCrew;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Pilot pilot;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrew, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfPilots() {
        return this.pilots.size();
    }

    public void addPilotToPilotsOnThisFlight(Pilot pilot){
        pilots.add(pilot);
    }

    public void deletePilotFromPilotsOnThisFlight(Pilot pilot){
        pilots.remove(pilot);
    }

    public int getNumberOfCabinCrew() {
        return cabinCrew.size();
    }

    public void addCabinCrewMemberToCabinCrewOnThisFlight(CabinCrew cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public void deleteCabinCrewMemberFromCabinCrewOnThisFlight(CabinCrew cabinCrewMember){
        cabinCrew.remove(cabinCrewMember);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
