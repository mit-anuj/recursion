import java.util.Scanner;


public class print_permutations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string: ");
        String str=sc.next();
        System.out.println("******************");
        printPermutations(str,"");
        sc.close();
    }
    public static void printPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            printPermutations(rem,ans+ch);
        }
    }
}
