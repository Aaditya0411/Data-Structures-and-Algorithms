package Recursion;


public class BinaryStringProblem {

    public static void printbinaryStirng( int n ,   int lastplace , StringBuilder str){

        if (n == 0 ) {
            System.out.println(str);
            return;
        }

        if (lastplace == 0) {
            
            printbinaryStirng(n-1, 0, str.append("0"));
            printbinaryStirng(n-1, 1, str.append("1"));
        }else{
            printbinaryStirng(n-1, 0, str.append("0"));
        }
    }

    public static void main(String[] args) {
        printbinaryStirng(3, 0, new StringBuilder(""));

    }
}
