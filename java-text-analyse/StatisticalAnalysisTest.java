import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

public class StatisticalAnalysisTest {

    @Test
    public void should_check_if_count_of_given_string_is_higher_than_0() throws FileNotFoundException {
        //given:
        int number = 1;

        //when:
        FileContent fileContent = new FileContent("testowy.txt");
        StatisticalAnalysis count = new StatisticalAnalysis(fileContent.wordIterator());
        int result = count.countOf("cztery");

        //than:
        assertEquals(number,result);
    }

    @Test
    public void should_check_zero_division(){
        
    }
}