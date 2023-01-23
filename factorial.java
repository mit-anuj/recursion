import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int x=sc.nextInt();
        int factor=fact(x);
        System.out.println(factor);
        sc.close();
    }

    public static int fact(int n){
        if(n==1)//!base condition
            return 1;
        int factor=fact(n-1);
        int factori=n*factor;
        return factori;
    }
}
