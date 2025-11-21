package Tugas6Praktikum;

import java.util.Scanner;

public class Soal_5 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan kolom : ");
        int kolom = input.nextInt();
        
        int data1[][] = new int[baris][kolom];
        int data2[][] = new int[baris][kolom];
        int hasil[][] = new int[baris][kolom];
        
        System.out.println("Isi Matrix Ke 1");
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Data1[" + i + "]" + "[" + j + "] : " );
                data1[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Isi Matrix Ke 2");
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Data2[" + i + "]" + "[" + j + "] : " );
                data2[i][j] = input.nextInt();
            }
            
        }
        System.out.println("======ISI MATRIX 1======");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(data1[i][j]);
            }
            System.out.println();
        }
        
        
        System.out.println("======ISI MATRIX 2======");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(data2[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("======HASIL PENJUMLAHAN======");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = data1[i][j] + data2[i][j];
                System.out.print(hasil[i][j]);
            }
            System.out.println();
        }
    }    
}
