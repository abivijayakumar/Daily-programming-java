import java.util.*;
public class Main{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,4,5};
    set<Integer> set = new LinkedHashSet<>();
    for(int x : arr)set.add(x);
    System.out.println("Array without duplicates: " +set);
  }
