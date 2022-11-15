import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class BOJ_1251 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1; i<k.length()-1; i++){
            String a = k.substring(0,i);
            String b = k.substring(i, k.length()-1);
            String c = k.substring(k.length()-1);
            list.add(reverse(a)+reverse(b)+reverse(c));

        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
    public static String reverse(String t){
        String f = "";
        for(int i = t.length()-1; i >=0; i--){
            f += ""+t.charAt(i);
        }
        return f;
    }
}
