package Tugas9;

public class Hewan {
    String nama;
    
    public void makan(){
        
    }
}

class kucing extends Hewan{
    String nama;
    
    public void display(String nama){
        super.nama = nama;
        System.out.println("Nama Hewan : " + nama);
    }
}