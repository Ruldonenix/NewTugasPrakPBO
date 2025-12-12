package Tugas9;

public class MainSoal1 {
    public static void main(String[] args) {
        Soal1 s = new Soal1();
        hewan2 h2 = new hewan2();
        hewan4 h4 = new hewan4();
        hewan6 h6 = new hewan6();
        hewan8 h8 = new hewan8();
        
        System.out.println("Macam-macam Hewan : ");
        h2.kaki = 2;
        h2.nama = "Kangguru";
        h4.kaki = 4;
        h4.nama = "Kucing";
        h6.kaki = 6;
        h6.nama = "Kupu-kupu";
        h8.kaki = 8;
        h8.nama = "Kepiting";
        
        h2.berkaki();
        h4.berkaki();
        h6.berkaki();
        h8.berkaki();
        System.out.println("Contoh Hewan");
        h2.namahewan();
        h4.namahewan();
        h6.namahewan();
        h8.namahewan();
    }
}
