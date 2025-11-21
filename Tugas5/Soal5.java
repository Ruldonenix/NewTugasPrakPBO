import java.util.Scanner;

public class Soal5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4- i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

