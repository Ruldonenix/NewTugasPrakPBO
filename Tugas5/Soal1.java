import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int terbesar = 0;
        int terkecil = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Bilangan Ke - " + (i + 1) + " : ");
            int angka = input.nextInt();
            
            if(i == 1){
                angka = terbesar;
                angka = terkecil;
            }else {
                if(angka > terbesar){
                    terbesar = angka;
                }
                if(angka < terkecil){
                    terkecil = angka;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Bilangan Terkecil : " + terkecil);
        System.out.println("Bilangan Terbesar : " + terbesar);
        
    }
}