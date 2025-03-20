import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        // Forfattere
        Author author1 = new Author("Bo Jensen");
        Author author2 = new Author("Arne Nougatgren");
        Author author3 = new Author("Lange jan");
        Author author4 = new Author("Brian Urskov Jensen");
        Author author5 = new Author("Aoife Niamh DeFaoite");
        Author author6 = new Author("Dino Saldic");
        Author author7 = new Author("Gertrud Underscore Ulriksen");


        // Fysiske bøger
        PrintedBook printedBook1 = new PrintedBook("Den grumme doktor", "SKØN", 250, 250);
        PrintedBook printedBook2 = new PrintedBook("Terkel er en spasser", "FAG", 1000, 15);
        PrintedBook printedBook3 = new PrintedBook("Knits 'N Giggles", "FAG",7777,777);

        // e-bøger
        EBook eBook = new EBook("Skunk er sundt", "LYRIK", 1500, 5, 5, 453, 9140,true);

        // Lydbøger
        AudioBook audioBook1 = new AudioBook("Der er højt til toppen", "TE", 1000, 300);
        AudioBook audioBook2 = new AudioBook("Fuglekald", "FAG", 10, 1600);

        // ELydbog
        EAudioBook eAudioBook = new EAudioBook("Bevar Christiania","SKØN", 140, 1, 1, 140, 140);

        // Tilføjer printedbook titler til vores ArrayList
        author1.addTitle(printedBook1);
        author2.addTitle(printedBook2);
        author5.addTitle(printedBook3);

        // Tilføjer lydbøger titler til vores ArrayList
        author3.addTitle(audioBook1);
        author6.addTitle(audioBook2);

        // Tilføjer ebog titler til vores ArrayList
        author4.addTitle(eBook);

        // Tilføjer ELydbog titler til vores ArrayList
        author7.addTitle(eAudioBook);

        // Udregner forfatterens totale udbetaling og tilføjer til vores Authors AL
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);
        authors.add(author6);
        authors.add(author7);

        // For each loop som sout'er alle vores informationer.
        for (Author i: authors) {
            System.out.println(i.getName() + ":" + " " + i.calculateTotalPay() + "kr");
        }
    }

}