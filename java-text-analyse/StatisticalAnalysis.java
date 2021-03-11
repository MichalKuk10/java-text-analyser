import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class StatisticalAnalysis {

    Iterator<String> iterator;
    public Integer numOfElements;
    Integer numOfUniqueElements;
    List<String> finalList;
    ArrayList<String> tempList = new ArrayList<String>();
    Set<String> uniqueList;


    StatisticalAnalysis(Iterator<String> iterator){

        this.iterator = iterator;

        while(iterator.hasNext()){
            tempList.add(iterator.next());
        }
    
    }

    public Integer size()
    {
        return tempList.size();
    }

    public Set<String> createUniqueList() {
        
        ArrayList<String> tempList = this.tempList;
        Set<String> uniqueList = new HashSet<String>(tempList);
        return uniqueList;
}

    public Integer dictionarySize(){

        numOfUniqueElements = 0;
        Set<String> uniqueList = createUniqueList();
        numOfUniqueElements = uniqueList.size();

        return numOfUniqueElements;
    }

    public List<String> occurMoreThan(Integer percent)
    {
        // System.out.println(size());

        finalList = new ArrayList<String>();

        Set<String> uniqueList = createUniqueList();
        
        int numOfElements = tempList.size();


        for(String word : uniqueList){
            Integer tempNumberOfOccur = countOf(word);
           

            if (((tempNumberOfOccur*100)/ numOfElements> percent)){
                finalList.add(word);
                }
        }
        
        return finalList;
    }

    public Integer countOf(String string){
        Integer numberOfOccur = 0;

        for (int i = 0; tempList.size() > i; i++ ){

            if (tempList.get(i).equals(string)){
                numberOfOccur++;
            }
        }
        return numberOfOccur;
    }
    
    public float ratio(String a, String b) {
        
        int ratioA = countOf(a);
        int ratioB = countOf(b);

        float finalRatio = ((float)ratioA) / ratioB;

        return finalRatio;
    }

    public float vowelsRatio() {
        
        int ratioA = countOf("a");
        int ratioE = countOf("e");
        int ratioO = countOf("o");
        int ratioI = countOf("i");
        int ratioU = countOf("u");

        int vowelsNum = ratioA + ratioE + ratioO + ratioI + ratioU;

        float vowelsRatio = ((float)vowelsNum) / tempList.size();

        return vowelsRatio;
    }

    public int getNumOfElements(){
        return this.numOfElements; 
    }

    
    public Map<String, Double> letterRatio(){

        Map<String, Double> tempMap = new HashMap<String, Double>();
        uniqueList = createUniqueList();
        numOfElements = tempList.size();

        for(String s: uniqueList){

            double ratio = (double)countOf(s)/numOfElements *100;
            
            double dupa = Math.round(ratio*100);
            double finalRatio = dupa /100.00;
            tempMap.put(s, finalRatio);
            
        }

        return tempMap;



    }



    
}



