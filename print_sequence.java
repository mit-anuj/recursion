import java.util.Scanner;

public class print_sequence {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter string: ");
        String str=sc.next();
        printSequence(str,"");
        sc.close();   
    }

    public static void printSequence(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String subs=str.substring(1);
        printSequence(subs, ans+"");
        printSequence(subs, ans+ch);
        
    }
}
