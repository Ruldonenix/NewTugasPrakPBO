package Tugas8;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = sc.nextInt();

        System.out.println("Biner: " + biner(n));
    }
    
    public static String biner(int n) {
        String biner = "";
        
        while (n > 0) {
            int sisa = n % 2;
            biner = sisa + biner;
            n = n / 2;
        }
        return biner;
    }
}