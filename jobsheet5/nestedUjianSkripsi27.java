import java.util.Scanner;
public class nestedUjianSkripsi27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String pesan;
        System.out.println("Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak)");
        String bebasKompen= sc.nextLine().trim();
        System.out.println("Masukkan Jumlah Log Pembimbing 1:");
        int bimbinganP1=sc.nextInt();
        System.out.println("Masukkan Jumlah Log Pemimbing 2");
        int bimbinganP2=sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua Syarat terpenuhi. Mahasiswa Bisa Mendaftar Ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan= "Gagal Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1<8){
                pesan="Gagal Log Bimbingan P1 Belum mencapai 8 kali";
            } else {
                pesan="Gagal Log Bimbingan P2 belum mencapai 4 kali";
            }
    } else {
        pesan="Gagal Mahasiswa masih memiliki tanggungan kompen" ;
            }
        System.out.println(pesan);  
            }
            
        {
}   }
