public abstract class NetBook extends Title {

protected int availability;
protected int reach;
protected int use;

public NetBook(String title, String literatureType, int copies, int availability, int reach, int use) {

    super(title, literatureType, copies);
    this.availability = availability;
    this.reach = reach;
    this.use = use;

}
    public int getAvailability() {
    return availability;
    }

    public int getReach() {
    return reach;
    }

}
