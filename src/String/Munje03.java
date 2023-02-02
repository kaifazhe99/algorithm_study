package String;

import java.util.Scanner;

public class Munje03 {
    //한 개의 문자이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요
    //문장속의 각 단어는 공백으로 구분됩니다.

    public String solution(String str){
        String answer="";
        int m=Integer.MIN_VALUE,pos;
        while((pos=str.indexOf(" "))!=-1){
            String tmp=str.substring(0,pos);
            int len= tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);

        }
        //split
//        String[] s=str.split(" ");
//        for(String x: s){
//            int len=x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }
        if(str.length()>m) answer=str;

        return answer;

    }

    public static void main(String[] args) {
        Munje03 munje = new Munje03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(munje.solution(str));

    }



}
