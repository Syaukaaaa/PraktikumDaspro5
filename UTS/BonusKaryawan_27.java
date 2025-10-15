import java.util.Scanner;
public class BonusKaryawan_27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Nilai Kinerja Karyawan =");
    double kinerjaKaryawan = sc.nextDouble();
    System.out.println("Lama Bekerja Karyawan =");
    double lamaKerja = sc.nextDouble();
    System.out.println("Gaji Pokok Karyawan =");
    double gajiPokok = sc.nextDouble();
    System.out.println("Apakah Karyawan Memiliki Sertifikat Nasional =");
    boolean sertifikasiNasional = sc.nextBoolean();
    double bonus = 0;
        // Syarat Mendapatkan Bonus
     if (kinerjaKaryawan < 70) {
            bonus = 0;
            System.out.println("Tidak mendapatkan bonus karena nilai kinerja di bawah 70.");
        } else {
            // Kinerja Karyawan Mencapai 70 sampai 89
            if (kinerjaKaryawan < 90) {
                if (lamaKerja < 2) {
                    bonus = 0.01 * gajiPokok;
                } else if (lamaKerja < 5) {
                    bonus = 0.03 * gajiPokok;
                } else {
                    bonus = 0.05 * gajiPokok;
                }
            } 
     else {  // Kinerja Mencapai 90
                if (lamaKerja < 2) {
                    bonus = 0.02 * gajiPokok;
                } else if (lamaKerja < 5) {
                    bonus = 0.04 * gajiPokok;
                } else {
                    bonus = 0.07 * gajiPokok;
                }
            }
     if (sertifikasiNasional==true) {// Kalau Ada Sertifikasi Nasional 
        bonus += 500.000;

        System.out.println("Nilai Kinerja   = " + kinerjaKaryawan);
        System.out.println("Lama Bekerja    = " + lamaKerja + " tahun");
        System.out.println("Gaji Pokok      = Rp " + gajiPokok);
        System.out.println("Sertifikasi     = " + sertifikasiNasional);
        System.out.println("Total Bonus     = Rp " + bonus);
     }
    }
    
}
}
