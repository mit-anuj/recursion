import java.util.Scanner;

public class print_number_descending {
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
}
