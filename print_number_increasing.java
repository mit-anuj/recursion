public class print_number_increasing {
    public static void print_increasing(int n){
        if(n==0){//! base condition
            return;
        }
        print_increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print_increasing(5);
    }
}
