public abstract class Title {

    private String title;
    private String literatureType;
    protected int copies;
    protected final double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 0.0;

        }
    }

    public String getTitle() {
        return title;
    }
}