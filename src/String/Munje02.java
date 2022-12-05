package String;


import java.util.Scanner;

public class Munje02 {
    public String solution(String str) {
        String answer = "";
//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }
        //풀이02
        //아스키번호
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }

        return answer;


    }

    public static void main(String[] args) {
        Munje02 munje = new Munje02();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(munje.solution(str));

    }

}
