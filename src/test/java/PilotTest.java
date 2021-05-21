import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot_1;
    private Pilot pilot_2;

    @Before
    public void before(){
        pilot_1 = new Pilot("Bruce Dickinson", Rank.CAPITAN, "BB674985X");
        pilot_2 = new Pilot("Bob Marley", Rank.FIRST_OFFICER, "AD667453U");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Bruce Dickinson", pilot_1.getName());
    }

    @Test
    public void canChangePilotName(){
        pilot_1.setName("Ozzy Osbourne");
        assertEquals("Ozzy Osbourne", pilot_1.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPITAN, pilot_1.getRank());
        assertEquals(Rank.FIRST_OFFICER, pilot_2.getRank());
    }

}
