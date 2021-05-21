package aircrafts;

public enum PlaneType {

    BOEING747(41000, 230),
    AIRBUSA320(39000, 210),
    DREAMLINER(50000, 800);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
