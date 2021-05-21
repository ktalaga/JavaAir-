package people;

public class CabinCrew extends Person {

    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String relayMessageToPassengers(){
        return "Please fasten your seatbelts";
    }
}
