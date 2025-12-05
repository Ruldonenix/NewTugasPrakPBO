package Tugas8;

class nilai{
    int data[] = {6,12,24,48,96};
    
    nilai(){
        for (int i : data) {
            System.out.println(i);
        }
    }
    
}

public class Soal7 {
    public static void main(String[] args) {
        nilai n = new nilai();
        System.out.println("data : " + n.data);
    }
}
