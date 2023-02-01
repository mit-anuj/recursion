import java.util.Scanner;

public class print_maze_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println("enter number of columns: ");
        int columns=sc.nextInt();
        printMP(1, 1, rows, columns, "");
        sc.close();

    }
    public static void printMP(int cr,int cc,int tr,int tc, String ans){
        if(cr== tr && cc== tc)
        {
            System.out.println(ans);
            return;
        }
        if(cc<tc){
            printMP(cr,cc+1,tr,tc,ans+ "h");
        }
        if(cr<tr){
            printMP(cr+1,cc,tr,tc,ans+"v");
        }
    }
}
