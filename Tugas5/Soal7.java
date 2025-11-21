public class Soal7 {
    public static void main(String[] args) {
        int i = 1;
        while(i < 5){
            System.out.println("Nilai i : " + i);
            i++;
        }
        System.out.println("---Perbedaan---");
        int  j = 1;
        while(j < 5){
            ++j;
            System.out.println("Nilai i : " + j);
        }
    }
}
