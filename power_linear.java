import java.util.Scanner;

public class power_linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int x=sc.nextInt();
        System.out.println("enter power");
        int n=sc.nextInt();

        if(n==0)
            System.out.println(1);
        else{
            int pwr=power(x,n);
            System.out.println(pwr);
        }
        sc.close();
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int pw=power(x,n-1);
        int pwr=x*pw;
        return pwr;
    }
}
