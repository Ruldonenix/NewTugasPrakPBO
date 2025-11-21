import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Masukkan Banyak Baris : ");
        int baris = input.nextInt();
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            System.out.print(angka + " ");
            angka +=2;
            total = total + angka;
        }
        System.out.println("");
        System.out.println("Total : " + total);
    }
}
