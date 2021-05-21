import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger_1;
    private Passenger passenger_2;

    @Before
    public void before(){
        passenger_1 = new Passenger("Jimi Hendrix", 1);
        passenger_2 = new Passenger("Elton John", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Jimi Hendrix", passenger_2.getName);
    }
}
