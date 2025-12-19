package Recursion;

public class FriendPairingProblem {
    
     public static int FriendsPairing(int n ){

        if(n ==1 || n == 2){
            return n ;
        }

        //kaam 
        int totalways = FriendsPairing(n-1) + (n-1)*FriendsPairing(n-2);
        return totalways;
     }

    public static void main(String[] args) {
        System.out.println(FriendsPairing(3));

    }
}
