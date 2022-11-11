import java.util.Scanner;

public class BOJ_15947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] k = "baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" ");
      //  System.out.println(k.length);
        int count = n / 14 ; // 몇 번째 블록인지 확인
        int index = n % 14 -1 ; // 몇 번째 단어인지 확인
        if(index == -1) index = 13;
        // 인덱스를 햇갈리지 않게 하기 위해 0부터 시작으로 통일 
      //  System.out.println(count+", "+index);
        if(k[index].equals("tururu")){
            if( count >= 3 ){
                System.out.println("tu+ru*"+(count+2));
            }else{
                String t = "tururu";
                for(int i =0; i<count; i++){
                    t+="ru";
                }
                System.out.println(t);
            }
        }else if(k[index].equals("turu")){
            if( count >= 4){
                System.out.println("tu+ru*"+(count+1));
            }else{
                String t = "turu";
                for(int i =0; i<count; i++){
                    t+="ru";
                }
                System.out.println(t);
            }
        }else{
            System.out.println(k[index]);
        }
    }
}
