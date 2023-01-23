import java.util.Scanner;

public class tower_of_hanoi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of boxes: ");
        int n=sc.nextInt();
        int t1d=sc.nextInt();
        int t2d=sc.nextInt();
        int t3d=sc.nextInt();
        toh(n,t1d,t2d,t3d);
    }

    public static void toh(int n,int t1id, int t2id,int t3id){

        if(n==0){
            return ;
        }
        toh(n-1,t1id,t3id,t2id);//! in this we are sending all the boxes remaining last box to t3 from t1 using t2
        System.out.println(n+ "[ "+ t1id+ "->"+t2id+ " ]");
        toh(n-1,t3id,t2id,t1id);//!(faith)  will print the instructions to move n-1 disks form t3 to t2 using t1
    }
}