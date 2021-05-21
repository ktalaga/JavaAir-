package peopleTests;

import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew cabinCrew_1;
    private CabinCrew cabinCrew_2;
    private CabinCrew cabinCrew_3;
    private CabinCrew cabinCrew_4;

    @Before
    public void before(){
        cabinCrew_1 = new CabinCrew("Mike Tyson", Rank.FLIGHT_ATTENDANT);
        cabinCrew_2 = new CabinCrew("Lennox Lewis", Rank.FLIGHT_ATTENDANT);
        cabinCrew_3 = new CabinCrew("Jon Jones", Rank.FLIGHT_ATTENDANT);
        cabinCrew_4 = new CabinCrew("Jan Blachowicz", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Jan Blachowicz", cabinCrew_4.getName());
    }

    @Test
    public void canChangeCabinCrewName(){
        cabinCrew_1.setName("Morris Moss");
        assertEquals("Morris Moss", cabinCrew_1.getName());
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew_1.getRank());
    }

    @Test
    public void canChangeCabinCrewRank(){
        cabinCrew_1.setRank(Rank.CAPITAN);
        assertEquals(Rank.CAPITAN, cabinCrew_1.getRank());
    }

    @Test
    public void canRelayMessageToPassengers(){
        assertEquals("Please fasten your seatbelts", cabinCrew_1.relayMessageToPassengers());
    }
}
