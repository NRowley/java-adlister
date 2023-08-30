import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
//        Albums////////////////////////////////////////////////////
        Album album1 = new Album(1, "nic", "album1", 1991, 1000000, new ArrayList<>());
        Album album2 = new Album(2, "nic", "album2", 1991, 1000000, new ArrayList<>());
        Album album3 = new Album(3, "nic", "album3", 1991, 1000000, new ArrayList<>());
        // Authors///////////////////////////////
        Author nicRowley = new Author(1, "Nic", "Rowley");
        Author killianRowley= new Author(2, "Killian", "Rowley");
//        Quotes /////////////////////////////////////
        Quote quote1 = new Quote(1, "Thats how they get ya", nicRowley);
        Quote quote2 = new Quote(2, "Dope", nicRowley);
        Quote quote3 = new Quote(3, "Oof...", nicRowley);
        Quote quote4 = new Quote(4, "geeeeesh", killianRowley);
        Quote quote5 = new Quote(5, "Leave me alone!", killianRowley);

        //List and iterate///////////////////////////

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);

        for (Quote quote : quotes) {
            System.out.printf("Author: %s %s%n Quote: \"%s\"%n", quote.author.getFirstName(), quote.author.getLastName(), quote.getContent());
        }
    }
}
