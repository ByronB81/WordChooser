import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WordCounterTest {

  @Test
  public void arrayCharles_takeInString_String() {
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    expectedOutput.add("abc");
    assertEquals(expectedOutput, testWordCounter.arrayCharles("abc"));
  }

  @Test
  public void arrayCharles_separateStringBySpaces_ArrayList(){
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    expectedOutput.add("abc");
    expectedOutput.add("def");
    assertEquals(expectedOutput, testWordCounter.arrayCharles("abc def"));
  }

  @Test
  public void countChocula_countNumberOfWords_int(){
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    testWordCounter.arrayCharles("abc def");
    expectedOutput.add("abc");
    expectedOutput.add("def");
    int testNum = expectedOutput.size();
    assertEquals(testNum, countChocula(testWordCounter));
  }


}
