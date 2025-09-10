import java.util.Arrays;
public class Main{
  public static void mian(String[] args){
    String s1 = "listen", s2 = "silent";
    char a[] = s1.toCharArray();
    char b[] = s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    System.out.println(Arrays.equals(a,b)?"Anagram" : "Not Anagaram");
  }
}
