package Tugas6Praktikum;

public class Soal_3 {
    public static void main(String[] args) {
        int[] data = new int[5];
        int indexkecil = 0;
        int indexbesar = 0;
        
        data[0] = 30;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;
        data[4] = 50;
        
        int terbesar = data[0];
        int terkecil = data[0];
        
        int total = 0;
        int hasil = 0;
        
        for (int i=0; i<data.length; i++){
            if(data[i] < terkecil){
                terkecil = data[i];
                indexkecil = i;
            }
            
            if(data[i] > terbesar){
                terbesar = data[i];
                indexbesar = i;
            }
            
            total = total + data[i];
        }
        
        for (int i=0; i<data.length; i+=2){
            hasil = hasil + data[i];
        }
        
        double rata = total/5;
        
        System.out.println("Data Terkecil Adalah : " + terkecil + " Berada Pada Index : " + indexkecil);
        System.out.println("Data Terbesar Adalah : " + terbesar + " Berada Pada Index : " + indexbesar);
        System.out.println("Hasil Setelah Di Jumlahkan : " + total);
        System.out.println("Rata-rata : " + rata);
        System.out.println("Penjumlahan Genap : " + hasil);
        
        if (hasil % 2 == 0){
            System.out.println("Hasil Merupakan Bilangan Genap");
        } else {
            System.out.println("Hasil Merupakan Bilangan Ganjil");
        }
        System.out.println("Semua Data Array");
        for (int wadah : data){
            System.out.println(wadah);
        }
    }
}