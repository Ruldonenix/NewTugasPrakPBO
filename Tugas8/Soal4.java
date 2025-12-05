package Tugas8;

import java.util.Scanner;

class kasir{
    String nama;
    double harga;
    double jumlah;
    double diskon;
    double total;
    
    kasir(String nama,double harga){
        Scanner input = new Scanner(System.in);
        this.nama = nama;
        this.harga = harga;
        System.out.println("nama barang : " + nama);
        System.out.println("harga barang adalah : " + harga);
        double total = harga;
        System.out.println("total belanja : " + total);
        System.out.print("bayar : ");
        double bayar = input.nextDouble();
        double totalbayar = bayar - total;
        System.out.println("kembalian : " + totalbayar);
    }
    
    kasir(String nama,double harga,double jumlah){
        Scanner input = new Scanner(System.in);
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        System.out.println("nama barang : " + nama);
        System.out.println("harga barang : " + harga);
        System.out.println("jumlah barang : " + jumlah);
        double total = harga * jumlah;
        System.out.println("total belanja : " + total);
        System.out.print("bayar : ");
        double bayar = input.nextDouble();
        double totalbayar = bayar - total;
        System.out.println("kembalian : " + totalbayar);
    }
    
    kasir(String nama,double harga,double jumlah,double diskon){
        Scanner input = new Scanner(System.in);
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
        System.out.println("nama barang : " + nama);
        System.out.println("harga barang : " + harga);
        System.out.println("jumlah barang : " + jumlah);
        System.out.println("diskon : " + diskon);
        total = (harga * jumlah) - diskon;
        System.out.println("total belanja : " + total);
        System.out.print("bayar : ");
        double bayar = input.nextDouble();
        double totalbayar = bayar - total;
        System.out.println("kembalian : " + totalbayar);
    }
}

public class Soal4 {
    public static void main(String[] args) {
        kasir k = new kasir("laptop", 500000, 2, 300000);
        System.out.println(k);
    }
}