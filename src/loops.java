import java.util.Scanner;

public class loops {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=20; i++) {
            System.out.println(n*i);

        }
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of n natural numbers :" +sum);
    }
}
