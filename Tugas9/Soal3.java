package Tugas9;

class kubus{
    public int panjang;
    private int lebar;
    private int tinggi;
    
    public void volume(int panjang,int lebar,int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
        int hasil = panjang * lebar * tinggi;
        System.out.println("volume kubus adalah : " + hasil);
    }
}

public class Soal3 {
    public static void main(String[] args) {
        kubus k = new kubus();
        k.volume(10, 12, 4);
    }
}
