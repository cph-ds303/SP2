public class EAudioBook extends NetBook {

    protected int durationInMinutes;

    public EAudioBook(String title, String literatureType, int copies, int availability, int reach, int use, int durationInMinutes){

        super(title, literatureType, copies, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }
    @Override
    protected double calculatePoints() {
        return (double) durationInMinutes /2 * convertLiteratureType() * ((getReach()*5) + getAvailability()*0.5)+use;
    }


}
