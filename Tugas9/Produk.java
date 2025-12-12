package Tugas9;

public class Produk {
    String judul;
    String penulis;
    
    Produk(String judul,String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }
}

class komik extends Produk{
    int jumlahHalaman;

    public komik(String judul, String penulis,int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public void getinfoproduk(){
        System.out.println("Judul Komik     : " + judul);
        System.out.println("Penulis Komik   : " + penulis);
        System.out.println("Jumlah Halaman  : " + jumlahHalaman);
    }
}

class game extends Produk{
    int waktu;
    
    public game(String judul, String penulis,int waktu) {
        super(judul, penulis);
        this.waktu = waktu;
    }
     public void getinfoproduk(){
        System.out.println("judul game : " + judul);
        System.out.println("pembuat game : " + penulis);
        System.out.println("waktu main : " + waktu + " jam ");
    }
}