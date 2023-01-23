import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int x=sc.nextInt();
        pzz(x);
        sc.close();
    }

    public static void pzz(int n){
        if(n==0)
            return ;
        System.out.println("pre"+n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);
        System.out.println("post"+n);
    }
}
