package planesTests;

import aircrafts.Plane;
import aircrafts.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane_1;
    private Plane plane_2;
    private Plane plane_3;

    @Before
    public void before(){
        plane_1 = new Plane(PlaneType.BOEING747);
        plane_2 = new Plane(PlaneType.AIRBUSA320);
        plane_3 = new Plane(PlaneType.DREAMLINER);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.DREAMLINER, plane_3.getPlaneType());
    }

    @Test
    public void planeHasWeight(){
        assertEquals("41000", plane_1.getPlaneWeight());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(230, plane_1.getPlaneCapacity();
    }
}
