import java.util.Scanner;

public class print_dec_inc {
    public static void print_decreasing_increasing(int n){
        if(n==0)//! base condition
            return ;
        System.out.println(n);
        print_decreasing_increasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        print_decreasing_increasing(x);
        sc.close();
    }
}
