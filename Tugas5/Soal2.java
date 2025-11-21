import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int total = 0;
        
        System.out.print("Masukkan Jumlah Angka : ");
        int jumlah = input.nextInt();
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Angka Ke - " + (i + 1) + " : ");
            angka = input.nextInt();
            
            total = total + angka;
        }
        
        double rata = total / jumlah;
        System.out.println("");
        System.out.println("Total Setelah Di Jumlahkan : " + total);
        System.out.println("Rata-rata : " + rata);
        
    }
}