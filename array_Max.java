import java.util.Scanner;

public class array_Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter values: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int max=arrayMax(arr,0);
        System.out.println(max);
    }

    public static int arrayMax(int []arr,int idx){
        if(idx==arr.length){//!base condition
            return 0;
        }
        int max=arrayMax(arr, idx+1);//!faith
        if(max<arr[idx])
            return arr[idx];
        else
            return max;
    }
}
