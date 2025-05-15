import java.util.ArrayList;
import java.util.HashSet;
public class Repeating Elements{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    list.add(1);
    list.add(3);
    list.add(7);
    list.add(5);
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();
    for(Integer num:list){
      if(!seen.add(num)){
        duplicates.add(num);
      }
    }
    System.out.println("Repeating elements: " + duplicates);
  }
}
  
