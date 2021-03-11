import java.util.Iterator;

class CharIterator{

    private Iterator<String> iterator;

    CharIterator(FileContent fileContent) {
        this.iterator = fileContent.charIterator();
    }

    public Iterator<String> getIterator(){
        return iterator;
    }
    
}