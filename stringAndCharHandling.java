public class stringAndCharHandling {

    public static void main(String[] args) {
        String s1 = "ATUl";

        // DIRECTLY FINDING THE CHAR WITH STRINGBUFFER
        StringBuffer sb = new StringBuffer("ABS");


        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == 'B') {

                System.out.println("char. found");
            } else {
                System.out.println("No char.");
            }
        }

        // BY CONVERTING STRING TO CHAR AND THEN FIND THE CHAR.
        char[] ch = s1.toCharArray(); // convert string to char
        char c = 'U';

        // find character in s1 string; find 'U'
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == 'U') {
                System.out.println("char. found");
            } else {
                System.out.println("No char.");
            }
        }

        //REVERSE A STRING method1
        //USING toCharArray() and append to string builder
        StringBuilder sbb = new StringBuilder();

        for (int j = ch.length-1; j >=0; j--) {
            sbb.append(ch[j]);
        }
        System.out.println(sbb);

        //REVERSE A STRING method2
        String inputStr = "Adess";
        String outputStr = "";
        for(int k = inputStr.length()-1; k>=0; k--){
            outputStr = outputStr+inputStr.charAt(k);
        }
        System.out.println(outputStr);

        //System.out.println(sb);
        //System.out.println(ch[1]);


// Swap 2 string 
String ss1 = "Atul";
String ss2 = "Kumar";

ss1 = ss1 + ss2;
ss2 = ss1.substring(0, (ss1.length()-ss2.length()));
ss1 = ss1.substring(ss2.length());

System.out.println(ss1);
System.out.println(ss2);


//reverse an array
int [] arr = {10, 20, 30, 40, 50};
int l = arr.length;

int [] revArr = new int[l];
int l1 = l;
for (int i =0; i<l ; i++) {
// revArr[l1-1] = arr[i];
// l1 = l1-1;
for (int j = l-1; j >=0; j--) {
    revArr[i] = arr[j];
    i++;
}

}
for (int j = 0; j < l; j++) {
        System.out.println(revArr[j]);
}


    }
}
