public class AudioBook extends PhysicalBook {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }

}
