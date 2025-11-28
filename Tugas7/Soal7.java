package Tugas7;

public class Soal7 {
    String nama;
    int npm;
    char kelas;
    
    public void informasimhs(String nama,int npm,char kelas){
        this.nama = nama;
        this.kelas = kelas;
        this.npm = npm;
        
        System.out.println("nama mahahasiswa : " + nama);
        System.out.println("npm : " + npm);
        System.out.println("kelas : " + kelas);
    }
}
