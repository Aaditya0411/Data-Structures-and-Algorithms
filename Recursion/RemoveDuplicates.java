package Recursion;

public class RemoveDuplicates {

    public static void removeduplicates(String str , int idx , StringBuilder newString , boolean map[]){
        if( idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if( map[currChar-'a'] == true){
            removeduplicates(str, idx+1, newString, map);
        }else{
            map[currChar-'a'] = true;
            removeduplicates(str, idx+1, newString.append(currChar), map);
        }
    }
    
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
