import java.util.ArrayList;
import java.util.Scanner;


public class get_stair_path {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of stairs: ");
        int count=sc.nextInt();

        ArrayList <String> paths= getStairsPath(count);

        for(String path: paths){
            System.out.println(path);

        }

        sc.close();
    }

    public static ArrayList <String>  getStairsPath(int count){
        if(count==0){ //!base condition for 0th step
            ArrayList <String> path= new ArrayList<>();
            path.add("");
            return path;
        }
        else{//! base condition for rest of the cases 
            if(count<0){
                ArrayList <String> path= new ArrayList<>();
                return path;
            }
        }

        ArrayList <String > paths1= getStairsPath(count-1);//! faith
        ArrayList <String > paths2= getStairsPath(count-3);//! faith
        ArrayList <String > paths3= getStairsPath(count-3);//! faith

        ArrayList <String> paths= new ArrayList<>();

        for(String path: paths1){
            paths.add(1+ path);
        }
        for(String path: paths2){
            paths.add(2+ path);
        }
        for(String path: paths3){
            paths.add(3+ path);
        }


        return paths;
    }
}
