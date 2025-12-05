package Tugas8;

public class Soal1 {
    public static void main(String[] args) {
        int a = 5;
        int hasil = faktorial(a);
        System.out.println("faktorial dari " + a + " adalah : " + hasil);
        
    }
    
    public static int faktorial(int a){
        int hasil = 1;        
            
        for (int i = 1; i <= a; i++) {
            hasil *= i;
        }
        return hasil;
        }
}