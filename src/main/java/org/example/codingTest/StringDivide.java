package org.example.codingTest;

public class StringDivide {
    public static void main(String[] args) {
        String s = args[0];
        char standard = ' ';
        boolean standardResetCheck = true;
        int standardLength = 1;
        int otherLength = 0;
        int answer = 0;
        for(int i=0; i<s.length();i++){
            if(standardResetCheck){
                standard = s.charAt(i);
                System.out.println(i + "번째 인덱스" + standard);
                standardResetCheck = false;
                standardLength = 1;
                i++;
            }
            if(i >= s.length()){
                answer++;
                break;
            }
            if(equalsCheck(standard, s.charAt(i))){
                otherLength++;
                System.out.println("otherLength ++");
            }else{
                standardLength++;
                System.out.println("standardLength ++");
            }
            if(standardLength == otherLength){
                answer++;
                otherLength = 0;
                standardResetCheck = true;
            }

            System.out.println(answer);
//            System.out.println("equalsCheck : " + s.charAt(i) + " : " + equalsCheck(standard, (char)s.indexOf(i)));


        }

        System.out.println(answer);

    }
    private static boolean equalsCheck(char standard, char check){
        if(standard == check) {
            return false;
        } else {
            return true;
        }
    }
}
