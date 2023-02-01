import java.util.Scanner;

public class print_maze_path_with_jumps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n=sc.nextInt();
        System.out.println("enter number of columns: ");
        int m=sc.nextInt();
        printMPWJ(1, 1, n, m, "");
        sc.close();
        
    }
    
    public static void printMPWJ(int cr,int cc, int tr,int tc,String ans){
        if(cc==tc && cr==tr){
            System.out.println(ans);
            return;
        }
        if(cc>tc || cc>tr)
            return;
        for(int i=1;i<tr || i<tc;i++){
            if(cc<tc)
                printMPWJ(cr, cc+i, tr, tc, ans+"h"+i);
            if(cr<tr)
                printMPWJ(cr+i, cc, tr, tc, ans+"v"+i);
            if(cr<tr && cc<tc)
                printMPWJ(cr+i, cc+i, tr, tc, ans+"d"+i);
        }
    }
}
