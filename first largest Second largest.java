import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {2,29,5,30,30,29};
    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;
    for(int ind = 1;ind<arr.length;ind++){
      if(arr[ind]>largest){
        secondLargest = largest;
        largest = arr[ind];
      }
      else if(arr[ind]>secondLargest && arr[ind] != largest){
        secondLargest = arr [ind];
      }
    }
    System.out.println("first largest = " +  largest);
    System.out.println("Second largest = " + largest);
  }
}
