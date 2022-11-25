import java.util.Scanner;

public class BOJ_5355 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n; i++){
            String[] cal = sc.nextLine().split(" ");
            double f = Double.parseDouble(cal[0]);
            for(int j = 1; j < cal.length; j++){
                if(cal[j].equals("@")){
                    f *= 3;
                }else if(cal[j].equals("%")){
                    f +=5;
                }else{
                    f -= 7;
                }
            }
            System.out.println(String.format("%.2f", f));
        }
    }
}
