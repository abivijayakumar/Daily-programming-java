import java.util.*;
public class divisors {
    public static int withoutmethod(int n){
        if(n==0)return n;
        n=Math.abs(n);
        for(int i=1;i<n;i++){
           if(n%i==0){
             System.out.print(i+" ");
           }
        }
        return n;
    }
    public static List<Integer>withmethod(int n){
        if(n==0)return List.of();
        n=Math.abs(n);
        List<Integer>li=new ArrayList<>();
        for(int i=1;i*(long)i<=n;i++){
            if(n%i==0){
                li.add(i);
            }
            if(i!=n/i){
                li.add(n/i);
            }
        }
        Collections.sort(li);
        return li;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The Divisors of number without methods ");
        System.out.println(withoutmethod(n));
        System.out.println("The Divisors of number with methods ");
        System.out.println(withmethod(n));
    }
}
