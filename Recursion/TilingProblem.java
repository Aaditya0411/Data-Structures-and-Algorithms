package Recursion;

public class TilingProblem {

    public static int tiles(int n ){

        if( n== 1 || n ==0){
            return 1 ;
        }
        
        
        int verticaltiles =  tiles(n-1);
        int horizontaltiles = tiles(n-2);
        int totalways = verticaltiles + horizontaltiles;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tiles(4));
    }
}
