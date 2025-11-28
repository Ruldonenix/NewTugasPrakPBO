package Tugas7;

public class Soal6CivitasMhs {
    public static void main(String[] args) {
        Soal6Dosen d = new Soal6Dosen();
        System.out.println("=======CIVITAS AKADEMIKA=======");
        d.nama = "yadi";
        System.out.println("Nama Dosen : " + d.nama);
        d.status = true;
        System.out.print("Status : " );
        if(d.status == true){
            System.out.println("Dosen Aktif");
        }else{
            System.out.println("Dosen Tidak Aktif");
        }
        Soal6Mhs m = new Soal6Mhs();
        m.nama = "andi";
        System.out.println("Nama Mahasiswa : " + m.nama);
        m.status = true;
        System.out.print("status : ");
        if(d.status == true){
            System.out.println(m.nama + " adalah mahasiswa aktif");
        }else{
            System.out.println(m.nama + " adalah mahasiswa tidak aktif");
        }
        Soal6Staff s = new Soal6Staff();
        s.nama = "siti";
        System.out.println("nama staff : " + s.nama);
        s.status = true;
        System.out.print("status : ");
        if(d.status == true){
            System.out.println(s.nama + " adalah staff aktif");
        }else{
            System.out.println(s.nama + " adalah staff tidak aktif");
        }
        
    }
}
