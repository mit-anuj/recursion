import java.util.Scanner;

public class display_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        display(arr,n-1);//! here we will pass index as n-1 as the last index will be n-1.
        sc.close();
    }

    public static void display(int arr[],int n){
        if(n<0){//!base condition.
            return ;
        }
        display(arr,n-1);  //!faith
        System.out.println(arr[n]);  //!F+E
    }
}
