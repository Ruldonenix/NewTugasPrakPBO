package Tugas6Praktikum;

public class Soal_2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BPM"};
        for (String wadah : mobil) {
            System.out.println(wadah);
        }
            System.out.println("===== Setelah Diubah =====");
            mobil[1] = "Testarossa";
            
            for (String wadah2 : mobil) {
                System.out.println(wadah2);
            }
    }
}
