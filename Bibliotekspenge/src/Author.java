import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();

    }

    public void addTitle(Title t) {
        titles.add(t);
    }


    @Override
    public String toString() {
        return "Author name: \"" + name + "\", titles:" + titles;
    }

    public float calculateTotalPay() {
        float totalPay = 0;
        for (Title title : titles) totalPay += (float) title.calculateRoyalty();
        return totalPay;
    }

    public String getName(){

            return name;
        }

}