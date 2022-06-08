import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count =0;
        while (a!=0){
            a=a/10;
            count++;
        }
        System.out.println("Разрядность числа - "  + count);
    }
}
