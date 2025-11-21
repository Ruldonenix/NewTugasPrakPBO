package Tugas6Praktikum;

public class Soal_9 {
public static void main(String[] args) {
        int[] usia = {12,4,5,2,6};
        
        System.out.println("Use For");
        for (int i = 0; i < 5; i++) {
            System.out.print(usia[i] + ",");
        }
        System.out.println("");
        System.out.println("Use While");
        int i = 0;
        while (i < 5){
            System.out.print(usia[i] + ",");
            i++;
        }
        System.out.println("");
        
        
    }    
}
