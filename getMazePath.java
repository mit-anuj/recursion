import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int n=sc.nextInt();
        System.out.println("enter number of columns: ");
        int m=sc.nextInt();

        ArrayList <String> paths= getMP(1,1,n,m);

        for(String path: paths) {
            System.out.println(path);
        }

        sc.close();
    }

    public static ArrayList<String> getMP(int row, int col, int n, int m) {
        
        if(row==n && col==m) {//!base condition.
            ArrayList <String> paths=new ArrayList<>();
            paths.add("");
            return paths;
        }
        ArrayList <String> hpaths=new ArrayList<>();
        ArrayList <String> vpaths=new ArrayList<>();
        if(col< m){//! chekcing whether it is possible to move horizontal on not.
            hpaths= getMP(row,col+1,n,m);
        }

        if(row< n){//! chekcing whether it is possible to move vertical on not.
            vpaths= getMP(row+1,col,n,m);
        }

        ArrayList<String> paths=new ArrayList<>();
       for(String hpath: hpaths){
        paths.add("h"+hpath);
       }
       for(String vpath: vpaths){
        paths.add("v"+vpath);
       }

       return paths;
    }
}
