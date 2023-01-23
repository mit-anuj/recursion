import java.util.Scanner;

public class power_logarithmetic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int x=sc.nextInt();
        System.out.println("enter power: ");
        int n=sc.nextInt();
        int xn=power(x,n); 
        System.out.println(xn);
        sc.close();   
    }

    public static int power(int x,int n){
        if(n==0)//!base condition
            return 1;
        int xnb2=power(x,n/2);
        int xn=xnb2*xnb2;

        if(n%2==1){
            xn=xn*x;
        }
        return xn;
    }
}