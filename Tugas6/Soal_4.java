package Tugas6Praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();
        
        ArrayList<Object> namamahasiswa = new ArrayList<Object>(); 
        ArrayList<Object> nilaimahasiswa = new ArrayList<Object>(); 
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input Untuk Mahasiswa Ke - " + (i + 1));
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Nilai : ");
            int nilai = input.nextInt();
            input.nextLine();
            
            namamahasiswa.add(nama);
            nilaimahasiswa.add(nilai);
           
        }
        System.out.println("=====DAFTAR NILAI MAHASISWA=====");
        System.out.print("NAMA" + "        ");
        System.out.print("NILAi " + "       ");
        System.out.println("STATUS ");

        for (int i = 0; i < jumlah; i++) {
            System.out.print(namamahasiswa.get(i) + "        ");
            System.out.print(nilaimahasiswa.get(i) + "          ");

            int nilaiMhs = (int) nilaimahasiswa.get(i);

            if (nilaiMhs >= 50) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }
        }

    }
}
