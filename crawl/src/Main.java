import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    private static Set<String> visited = new HashSet<>();

    public static void main(String[] args) throws IOException {
        final String url = args[0];
        final int depth = Integer.parseInt(args[1]);

        crawl(url, depth, 0);
    }

    private static void crawl(String url, int maxDepth, int currentDepth) throws IOException {
        if (currentDepth >= maxDepth || visited.contains(url)) {
            return;
        }

        System.out.println("  ".repeat(currentDepth) + url + " " + currentDepth);

        visited.add(url);
        currentDepth++;

        try {
            List<String> searchedLinks = Jsoup.connect(url).get().getElementsByTag("a").stream()
                    .filter(element -> element.attr("href").startsWith("https://"))
                    .map(element -> element.attr("href"))
                    .toList();

            for (String link : searchedLinks) {
                crawl(link, maxDepth, currentDepth);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}