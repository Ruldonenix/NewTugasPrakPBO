package Tugas9;

class segitiga{
    protected double alas;
    protected double tinggi;
    
    public void luas(double alas,double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        
        double hasil = 0.5 * alas * tinggi;
        
        System.out.println("hasil luas segitiga dari alas : " + alas + " tinggi : " + tinggi +" adalah : " + hasil);
    }
}

public class Soal2 {
    public static void main(String[] args) {
        segitiga s = new segitiga();
        s.luas(5, 10);
    }
}
