public class EBook extends NetBook{

    protected int characters;
    protected boolean illustrated;

    public EBook (String title, String literatureType, int copies, int availability, int reach, int use, int characters, boolean illustrated){

        super(title, literatureType, copies, availability, reach, use);
        this.characters = characters;
        this. illustrated = illustrated;

    }

    private double calculatePages(){

        if(illustrated) return (double) (characters /1800 +20) * 1.10;

        else return (double) characters /1800 +20;
    }


    public double calculatePoints(){
        return calculatePages() * convertLiteratureType() * ((getReach()*5) + getAvailability()*0.5)+use;
    }

}
