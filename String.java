import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int k = scan.nextInt();
    s = s.replace("-","").toUpperCase();
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for(int i=s.length()-1;i>=0;i--)
      {
        sb.append(s.charAt(i));
        count++;
        if(count==k&&i!=0)
        {
          sb.append("-");
          count = 0;
        }
      }
    System.out.println(sb.reverse().toString());
  }
}
