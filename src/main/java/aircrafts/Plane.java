package aircrafts;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPlaneWeight() {
        return planeType.getWeight();
    }

    public int getPlaneCapacity(){
        return planeType.getCapacity();
    }

}
