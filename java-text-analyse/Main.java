import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;


class Main {

    static String fileName;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {


        FileContent fileContent = new FileContent("testowy.txt");
        StatisticalAnalysis charAnalysis = new StatisticalAnalysis(fileContent.charIterator());
        StatisticalAnalysis wordAnalysis = new StatisticalAnalysis(fileContent.wordIterator());
        View view = new View();
    

        view.print("--- TEXT ANALYSIS ---");

        view.print("Char count: " + charAnalysis.size());

        view.print("Word count: " + wordAnalysis.size());

        view.print("Dictionary size: " + wordAnalysis.dictionarySize());

        view.print("Most used words (>30%): " + wordAnalysis.occurMoreThan(30));

        view.print("'love' count: " + wordAnalysis.countOf("love"));

        view.print("'hate' count: " + wordAnalysis.countOf("hate"));

        view.print("'music' count: " + wordAnalysis.countOf("music"));

        view.print("vowels %: " + charAnalysis.vowelsRatio());

        view.print("a:e count ratio: " + charAnalysis.ratio("a", "e"));

        view.print(charAnalysis.letterRatio());
    }


        
}