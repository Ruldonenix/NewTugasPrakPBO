package Tugas8;

class nilai{
    double angka;
    
    nilai(double a){
        this.angka = a;
    }
    
    double panggil(){
        nilai n = new nilai(angka);
        return n.angka;
    }
}
public class Soal6 {
    public static void main(String[] args) {
        nilai n1 = new nilai(50);
        System.out.println(n1.panggil());
    }
}