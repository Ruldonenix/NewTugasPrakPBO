package Tugas7;

public class Soal3 {
    String bulan;
    int tanggal;
    
    public void tampilkan(String bulan,int tanggal){
        this.bulan = bulan;
        this.tanggal = tanggal;
        bulan = bulan.toLowerCase();
        int hasilbulan = 0;
        switch (bulan) {
            case "Januari" : {
                hasilbulan = 1;
                break;
            }
            case "Februari" : {
                hasilbulan = 2;
                break;
            }
            case "Maret" : {
                hasilbulan = 3;
                break;
            }
            case "April" : {
                hasilbulan = 4;
                break;
            }
            case "Mei" : {
                hasilbulan = 5;
                break;
            }
            case "Juni" : {
                hasilbulan = 6;
                break;
            }
            case "Juli" : {
                hasilbulan = 7;
                break;
            }
            case "Agustus" : {
                hasilbulan = 8;
                break;
            }
            case "September" : {
                hasilbulan = 9;
                break;
            }
            case "Oktober" : {
                hasilbulan = 10;
                break;
            }
            case "November" : {
                hasilbulan = 11;
                break;
            }
            case "Desember" : {
                hasilbulan = 12;
                break;
            }
            default : {
                System.out.println("Bulan Tidak Valid!");
                break;
            }
        }
        
        int bulanhasil = hasilbulan * 100 + tanggal;
        System.out.println("Hasil Tebakan : " + bulanhasil);
    }
}
