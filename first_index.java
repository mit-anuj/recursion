import java.util.Scanner;

public class first_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter values: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter number: ");
        int num=sc.nextInt();
        int idx=afo(arr,num ,0);
        if(idx==-1)
            System.out.println("number not found");
        else
            System.out.println(idx);
        sc.close();
    }

    public static int afo(int []arr,int num,int idx){
        if(idx==arr.length){
            return -1;
        }
        
        if(arr[idx]==num)
            return idx;
        else
        {
            return afo(arr,num,idx+1);
        }
        
    }
}
