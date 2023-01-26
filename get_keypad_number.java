import java.util.ArrayList;
import java.util.Scanner;

public class get_keypad_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter nubmer: ");

        String str=sc.next();

        ArrayList <String> result=getKPC(str);

        System.out.println(result);

        sc.close();

    }

    public static String[] codes={",;","abc","def","ghi","jkl","mno","pqrs","tu","VWX","yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length()==0)// base condition
        {
            ArrayList <String> response= new ArrayList<String>();
            response.add("");
            return response;
        }
        char ch= str.charAt(0);// this will get the first int of the input.
        String rstr=str.substring(1);// this will separate the remaining part of the input
        ArrayList<String> res=getKPC(rstr);// recursive call(faith)
        ArrayList<String> mres=new ArrayList<>();// F+E
        String codeforch= codes[ch-'0'];// get the string from the codes string //! ASCII code of '0' is 48 so we are subtracting 48 form ch so that we can use the actual value.
        for(int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            for (String val: res){
                mres.add(chcode+ val);
            }
        }

        return mres;
    }
}
