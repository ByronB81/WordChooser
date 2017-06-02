import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class WordCounterTest {

  @Test
  public void runWordCounter_takeInString_String() {
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    expectedOutput.add("abc");
    assertEquals(expectedOutput, testWordCounter.runWordCount("abc"));
  }

  @Test
  public void runWordCounter_separateStringBySpaces_ArrayList(){
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    expectedOutput.add("abc");
    expectedOutput.add("def");
    assertEquals(expectedOutput, testWordCounter.runWordCount("abc def"));
  }

  @Test
  public void runWordCount_countNumberOfWords_int(){
    WordCounter testWordCounter = new WordCounter();
    List<Object> expectedOutput = new ArrayList<>();
    expectedOutput.add("abc");
    expectedOutput.add("def");
    int testNum = expectedOutput.size();
    assertEquals(testNum, testWordCounter.runWordCount("abc def"));
  }


}
