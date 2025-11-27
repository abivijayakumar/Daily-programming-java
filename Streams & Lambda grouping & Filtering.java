import java.util.*;
import java.util.stream.*;
public class StreamExample{
  public static void main(String[] args){
    List<String> words = Arrays.asList("apple", "ant", "bat", "ball", "cat", "car");
    Map<Character, List<String>> grouped = words.stream().filter(w -> w.length()>2).collect(Collectors.groupingBy(w -> w.charAtr(0)));
    grouped.forEach((k, v) -> System.out.println(k + " -> " + v));
  }
}
