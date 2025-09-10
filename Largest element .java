public class LargestArray{
  public static void main(String[] args){
    int arr[] = {3,9,1,44,6};
    int max = arr[0];
    for(int n : arr){
      if(n > max)max = n;
    }
    System.out.println("Largest = " + max);
  }
}
