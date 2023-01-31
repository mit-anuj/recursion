import java.util.Scanner;

public class print_stair_path {
    public static void printSP(int path,String ans)
    {
        if(path==0)
        {
            System.out.println(ans);
            return;
        }
        if(path<0)
            return;

        printSP(path-1,ans+"1");
        printSP(path-2,ans+"2");
        printSP(path-3,ans+"3");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of stairs: ");
        int num=sc.nextInt();

        printSP(num, "");
        sc.close();
    }

}
