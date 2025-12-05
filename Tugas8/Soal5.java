package Tugas8;

class persegipanjang{
    double panjang;
    double lebar;
    boolean status;
    
    persegipanjang(double p,double l){
        this.panjang = p;
        this.lebar = l;
    }
    
    persegipanjang(double p,double l,boolean s){
        this.panjang = p;
        this.lebar = l;
        this.status = s;
    }
    
    double luas(persegipanjang pp){
        System.out.println("panjang : " + panjang);
        System.out.println("lebar : " + lebar);
        double luas = panjang * lebar;
        System.out.println("luasnya adalah : " + luas);
        return luas;
    }
}
public class Soal5 {
    public static void main(String[] args) {
        persegipanjang p = new persegipanjang(10, 8);
        persegipanjang p2 = new persegipanjang(5, 4, true);
        System.out.println(p.luas(p2));
    }
}