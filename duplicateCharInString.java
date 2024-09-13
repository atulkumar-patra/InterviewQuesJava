import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicateCharInString {
    public static void main(String[] args) {
        
        String ss = "Address";
        int count = 0;
        char[] ch = ss.toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i] == ch[i+1]){
                System.out.println(ch[i]);
               
                //avoid visiting same char
                while (i<ch.length -1 && ch[i] == ch[i+1]) {
                    i++;
                    
                }
            }
        }

    }
}
