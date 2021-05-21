package planesTests;

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
        plane_1 = new Plane(PlaneType.AIRBUSA320);
        plane_1 = new Plane(PlaneType.DREAMLINER);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.DREAMLINER, plane_3.getType());
    }

}
