package words.searching;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) {

        String[] excluded = {"ponieważ", "jako", "oraz", "jeśli"};

        Connection connect = Jsoup.connect(
                "http://www.onet.pl/");
        try {
            FileWriter out = new FileWriter("popular_words.txt");
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
//                System.out.println(elem.text());
                String words = elem.text();
                String newWords = words.replaceAll("\"", "");
                StringTokenizer token = new StringTokenizer(newWords, " ?.,");
                while (token.hasMoreTokens()) {
                    String word = token.nextToken();
                    if (word.length() > 3) {
                        out.append(word);
                        out.append(" ");
                    }
                    out.append("\n");
                }
            }
        } catch
        (IOException e) {
            e.printStackTrace();
        }


        try {
            File file = new File("popular_words.txt");
            Scanner scan = new Scanner(file);
            FileWriter writer = new FileWriter("filtered_popular_words.txt");

            while (scan.hasNextLong()) {
                String line = scan.nextLine();
                if (ifContains(excluded, line)) {
                    writer.append("line");
                    writer.append("\n");
                }
            }
        }catch (IOException e) {
                    e.printStackTrace();
                }
                }


        private static boolean ifContains(String [] tab, String str){
        for (int i = 0; i <tab.length ; i++) {
            if(str.equals(tab[i])){
                return true;
            }

        }
        return false;
    }
}

