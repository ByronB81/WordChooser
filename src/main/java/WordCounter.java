import java.util.ArrayList;
import java.util.List;

public class WordCounter {
  String userString;
  int wordCount;

  public List<String> arrayCharles(String userInput){
    List<String> wordArray = new ArrayList<>();
    for (String word : userInput.split(" ")){
      wordArray.add(word);
    }

    wordCount = wordArray.size();

    return wordArray;

  }

  public int countChocula(WordCounter userArray){
    return userArray.size();
  }

  // public int count(List<String> functionArray){
  //   wordCount = functionArray.size();
  //   return wordCount;
  // }

}
