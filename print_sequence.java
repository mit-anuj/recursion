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
        if(str.length()==0){// base condition.
            System.out.println(ans);// this will print the sequence.
            return;
        }
        char ch=str.charAt(0);// this will get the first character.
        String subs=str.substring(1);// this will store the remaining characters of the string.
        printSequence(subs, ans+"");// this condition will add blank.
        printSequence(subs, ans+ch);// this condition will add ch in fornt of the answer.
        
    }
}
