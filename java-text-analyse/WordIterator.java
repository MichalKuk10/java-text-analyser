import java.util.Iterator;

class WordIterator{

    private Iterator<String> iterator;

    WordIterator(FileContent fileContent) {
        this.iterator = fileContent.wordIterator();
    }

    public Iterator<String> getIterator(){
        return iterator;
    }

    
}