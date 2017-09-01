import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

//Have to think about form of graphical output (i.e., Swing vs. Website/Spring)

//Will need a two-dim array (or some other data structure) indicating whether two
//links are connected (This idea off the top of my head is n^2 rather than n!).
public class Scraper {

    private static final String KEYWORD = "Robotics";

    public static void main(String[] args) {
        //System.out.println(getContent("https://en.wikipedia.org/wiki/Toast_sandwich"));
        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/" + KEYWORD).get();
            Elements links = doc.getElementsByTag("a");
            for (Element link: links) {
                String connection = link.attr("href");
                if (connection.startsWith("/wiki/") && !connection.contains(".")) {
                    System.out.println(connection);
                }
            }
        } catch (IOException e) {}
    }

    //public static Map getMap(String wikiLink) {
        //If you want to make a map object based on connections between WikiLinks.
    //}
}
