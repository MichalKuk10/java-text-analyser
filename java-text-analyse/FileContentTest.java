import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.beans.Transient;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class FileContentTest {

    @Test
    public void should_check_if_file_is_empty() throws FileNotFoundException {
        //given:
        String name = "testowy.txt";

        //when:
        FileContent result = new FileContent("testowy.txt");

        //then:

        List<String> wordList = result.getCharList();
        List<String> charList = result.getWordList();


        assertNotNull(wordList);
        assertNotNull(charList);
        // assertTrue(wordList.size()>0);
        // assertTrue(charList.size()>0);
        assertEquals(wordList.size(), 3);
        //assertnull
        //assert lenght > 0 
        //assert 
    }
    

    @Test
    public void should_return_string_of_words_from_file() throws FileNotFoundException {
      //  given:
        String expectedStringofWord = "[cztery, slowa]";
        String expectedStringofChar = "czteryslowa";

        // when:
        FileContent fileContent = new FileContent("testowy.txt");

        // then:
        assertEquals(expectedStringofWord,fileContent.getWordList());
        assertEquals(expectedStringofChar,fileContent.getCharList());

    }

    @Test(expected = FileNotFoundException.class)
    public void should_return_FileNotFoundException_while_file_not_exist() throws FileNotFoundException {
        // given:
        String notExistingFileName = "notExistingFile";

        // when:
        new FileContent(notExistingFileName);
    } 
}



