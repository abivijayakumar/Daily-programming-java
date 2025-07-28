import java.util.ArrayList;
import java.util.Scanner;
public class studentList{
  public static void main(String[] args){
    ArrayList<String> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("\n--- Student List Menu ---");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("
