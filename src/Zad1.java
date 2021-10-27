import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();

        System.out.print("Введите число: ");
        int y = in.nextInt();

        if ((x + y) >= 10 && (x + y) <= 20) {
            System.out.println(x + y);
        } else{
            System.err.println("False-Условие не входит в рамки 10-20");
        }
    }
}
