import java.util.Scanner;

public class print_keypad_combination {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter combination: ");
        String combination=sc.next();
        printKC(combination,"");

        sc.close();
    }
    public static String[] codes={",;","abc","def","ghi","jkl","mno","pqrs","tu","VWX","yz"};
    public static void printKC(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+ " ");
            return;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        String code=codes[ch-'0'];
        for(int i=0;i<code.length();i++){
            printKC(rem,ans+code.charAt(i));
        }
    }
}
