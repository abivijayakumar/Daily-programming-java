import java.util.*;
public class Main{
  public static void main(String[] args){
    int [] arr = {9,1,12,12,5};
    for(int i = 0; i < arr.length;i++)
      {
        for(int j = 0; j < arr.length;j++)
          {
            if(arr[i] == arr[j])
            {
              System.out.printl("Duplicate number " + arr[j]);
            }
          }
      }
  }
