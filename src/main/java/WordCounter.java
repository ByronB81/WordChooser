import java.util.ArrayList;
import java.util.List;

public class WordCounter {
  String userString;

  public List<String> runWordCount(String userInput){
    List<String> wordArray = new ArrayList<>();
    for (String word : userInput.split(" ")){
      wordArray.add(word);
    }
    //wordArray.add(userInput);


    return wordArray;

  }

}
