package Tugas7;

public class soal5 {
    public void rekursif(int n){
        if (n == 0){
            System.out.println("Selesai");
            return;
        }
        System.out.println(n);
        rekursif (n - 1);
    }
}
