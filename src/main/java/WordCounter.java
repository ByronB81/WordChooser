import java.util.ArrayList;
import java.util.List;

public class WordCounter {
  String userString;
  int wordCount;

  public int runWordCount(String userInput){
    List<String> wordArray = new ArrayList<>();
    for (String word : userInput.split(" ")){
      wordArray.add(word);
    }

    wordCount = wordArray.size();

    return wordCount;

  }

  // public int count(List<String> functionArray){
  //   wordCount = functionArray.size();
  //   return wordCount;
  // }

}
