package BackTracking;

public class Subsets {

    public static void findSubSets(String str , String ans , int i ){
        // base case 
        if(i == str.length()){

            if (ans.length() == 0) {
                System.out.println("NUll");
            }else{
                System.out.println(ans);
            }
            return;
        }


        // recursion 
        // Yes choice
        findSubSets(str, ans+str.charAt(i), i+1);
        //No coice 
        findSubSets(str, ans, i+1);

    }
        
    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }
}
