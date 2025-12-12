package Tugas9;

public class MainProduk {
    public static void main(String[] args) {
        Produk p = new Produk("ep ep","sugeng");
        komik k = new komik(p.judul,p.penulis,200);
        k.getinfoproduk();
       game g = new game(p.judul,p.penulis,8);
        g.getinfoproduk();
    }
}
