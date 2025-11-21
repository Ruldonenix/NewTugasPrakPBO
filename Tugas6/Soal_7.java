package Tugas6Praktikum;

class mythread extends Thread{
    public void run(){
        System.out.println("Kore wa Thread no Syahrul da");
}
}
public class Soal_7 {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();
        System.out.println("Kore wa Main no Syahrul da");
    }
}
