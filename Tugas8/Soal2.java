package Tugas8;

public class Soal2 {
    public static void main(String[] args) {
        int hasil = pangkat(2,3);
        System.out.println(hasil);

    }
    
    public static int pangkat(int a, int b) {

        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
            return hasil;
    }

}
