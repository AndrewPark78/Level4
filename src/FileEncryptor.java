import java.util.ArrayList;
public class FileEncryptor {
   public static String encrypt(String input){
       String output = "";
       ArrayList<Character> holds = new ArrayList<Character>();
       for(int i = 0; i < input.length(); i++){
           holds.add(input.charAt(i));
       }
       for(char c: holds) {
           if(c == 121){
               c = 97;
           }else if(c == 122){
               c = 98;
           }else {
               c += 2;
           }

           output+= c;
       }
       return output;
   }
    public static String decrypt(String input){
        String output = "";
        ArrayList<Character> holds = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++){
            holds.add(input.charAt(i));
        }
        for(char c: holds) {
            if(c == 97){
                c = 121;
            }else if(c == 98){
                c = 122;
            }else {
                c -= 2;
            }

            output+= c;
        }
        return output;
    }
}
