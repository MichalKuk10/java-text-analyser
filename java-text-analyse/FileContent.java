import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class FileContent implements IterableText {

    private String fileName;
    private String fileContent;
    private List<String> wordList;
    private List<String> charList;
    private String filePath;
    private File file;    
    private Scanner scan;

    FileContent(String filePath) throws FileNotFoundException {
        this.filePath = filePath;
        createWordList();
        createCharList();
    }

   
    public void createWordList()  throws FileNotFoundException {
        file = new File(filePath);
        scan = new Scanner(file);
        fileContent = "";
        while(scan.hasNext()){
            fileContent += scan.next() + " ";
        }

        String tab[] = fileContent.split(" ");
        wordList = Arrays.asList(tab);
        scan.close();
    }


    public void createCharList() throws FileNotFoundException{
        file = new File(filePath);
        scan = new Scanner(file);
        fileContent = "";
        while(scan.hasNext()){
            fileContent += scan.next();
        }
        String tab2[] = fileContent.split("");
        charList = Arrays.asList(tab2);
        scan.close();
    }


    public List<String> getWordList() {
        return wordList;
    }

    public List<String> getCharList(){
        return charList;
    }

    @Override
    public Iterator<String> charIterator() {
        Iterator<String> iterator = charList.iterator();
        return iterator;
    }

    @Override
    public Iterator<String> wordIterator() {
        Iterator<String> iterator = wordList.iterator();
        return iterator;
    }


    public String getFilename(){
        return fileName;
    }
}