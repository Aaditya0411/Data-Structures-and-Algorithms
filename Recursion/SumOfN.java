package Recursion;

public class SumOfN {

    public static int NaturalNos(int n){
        if( n == 0 ){
            return 0 ;
        }

        return NaturalNos(n-1) + n;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(NaturalNos(n));
    }
}
