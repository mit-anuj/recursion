import java.util.Scanner;

public class all_Indices{
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
        int []sol=printAllIndices(arr,num,0 ,0);
        if(sol[0]==-1){
            System.out.println("not found: ");
        }
        else{
            for(int i=0;i<sol.length;i++)
                System.out.println(sol[i]+ " ");
        }
        sc.close();
    }

    public static int[] printAllIndices(int arr[],int num,int idx, int fsf){// fsf: found so far
        if(idx==arr.length)
            return new int[fsf];
        if(arr[idx]==num)
            fsf++;
        int []sol=printAllIndices(arr, num, idx+1, fsf);

        if(arr[idx]==num)
        {
            sol[fsf-1]=idx;
            fsf--;
            return sol;
        }
        else
        {
            return sol;
        }
        
    }
}