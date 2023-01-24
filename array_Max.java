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

        int max=arrayMax(arr,n-1);
        System.out.println(max);
    }

    public static int arrayMax(int []arr,int idx){
        static int max=0;
        if(idx==arr.length){
            return 
        }
        if(max<arr[idx]){
            max=arr[idx];
        }
        arrayMax(arr, idx+1);

    }
}
