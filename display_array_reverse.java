import java.util.Scanner;

public class display_array_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        displayReverse(arr,n-1);
        sc.close();
    }

    public static void displayReverse(int []arr,int idx){
        if(idx<0)
            return;
        System.out.println(arr[idx]);
        displayReverse(arr, idx-1);
    }
}
