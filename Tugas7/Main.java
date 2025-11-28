package Tugas7;

public class Main {
    public static void main(String[] args) {
        Soal1 s1 = new Soal1(); // mengubah class menjadi sebuah object
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        
        s1.soal1 = 1;
        s1.tampil();
        
        s2.lebar = 10;
        s2.panjang = 15;
        s2.keliling();
        
        s3.tampilkan("Maret", 15);
        System.out.println("=========Soal 4=========");
        
        Soal4 s4 = new Soal4();
        System.out.println("==========================");
        s4.paragraf2();
        System.out.println("==========================");
        s4.paragraf3();
        System.out.println("==========================");
        
        soal5 s5 = new soal5();
        s5.rekursif(5);
        
        Soal7 s7 = new Soal7();
        s7.informasimhs("Nabil", 123, 'B');
    }
}
