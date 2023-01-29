import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_path_with_jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("enter number of columns: ");
        int cols = sc.nextInt();

        ArrayList <String> paths =getMPWJump(1, 1, rows, cols);

        for(String path : paths) {
            System.out.println(path);
        }
        sc.close();
    }

    public static ArrayList<String> getMPWJump(int cr,int cl,int tr,int tc){
        if(cr==tr && cl==tc){//!base condition.
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }

        ArrayList <String> hpaths=new ArrayList<>();
        ArrayList <String> vpaths=new ArrayList<>();
        ArrayList <String> dpaths=new ArrayList<>();
        ArrayList <String> paths=new ArrayList<>();

        for(int i=1;i<=tr || i<=tc;i++){
            if(cr<tr)
                hpaths=getMPWJump(cr+i, cl, tr, tc);
            if(cl<tc)
                vpaths=getMPWJump(cr, cl+i, tr, tc);
            if(cr<tr && cl<tc)
                dpaths=getMPWJump(cr+i, cl+i, tr, tc);

            for(String hpath: hpaths ){
                paths.add("h"+i+hpath);
            }
            for(String vpath: vpaths ){
                paths.add("v"+i+vpath);
            }
            for(String dpath: dpaths ){
                paths.add("d"+i+dpath);
            }
        }

        

        return paths;
    }
}
