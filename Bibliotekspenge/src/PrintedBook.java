public class PrintedBook extends PhysicalBook {

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return (pages) * convertLiteratureType() * copies;
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String toString() {
        return "PrintedBook" + "title:'" + getTitle();
    }



}