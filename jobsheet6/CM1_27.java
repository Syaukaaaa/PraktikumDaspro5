import java.util.Scanner;

public class CM1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memasukkan Identitas Mahasiswa
        System.out.println("==INPUT DATA MAHASISWA==");
        String namaMahasiswa;
        System.out.println("Masukkan Nama Mahasiswa =");
        namaMahasiswa = sc.nextLine();
        System.out.println("Masukkan Nim Mahasiswa =");
        String nimMahasiswa;
        nimMahasiswa = sc.nextLine();

        // Input Nilai Mata Kuliah 1 : Algoritma Pemrograman
        System.out.println("==Mata Kuliah 1: Algoritma dan Pemrograman==");
        int nilaiUts1;
        System.out.println("Masukkan Nilai UTS =");
        nilaiUts1 = sc.nextInt();
        int nilaiKuiz1;
        System.out.println("Masukkan NIilai Kuiz =");
        nilaiKuiz1 = sc.nextInt();
        int nilaiUas1;
        System.out.println("Masukan Nilai UAS =");
        nilaiUas1 = sc.nextInt();
        int nilaiTugas1;
        System.out.println("Masukan Nilai Tugas =");
        nilaiTugas1 = sc.nextInt();

        // Input Nilai Mata Kuliah 2:Struktur data
        System.out.println("==Mata Kuliah 2: Struktur Data==");
        int nilaiUts2;
        System.out.println("Masukkan Nilai UTS =");
        nilaiUts2 = sc.nextInt();
        int nilaiKuiz2;
        System.out.println("Masukkan NIilai Kuiz =");
        nilaiKuiz2 = sc.nextInt();
        int nilaiUas2;
        System.out.println("==Masukan Nilai UAS ==");
        nilaiUas2 = sc.nextInt();
        int nilaiTugas2;
        System.out.println("Masukan Nilai Tugas =");
        nilaiTugas2 = sc.nextInt();

        // Membuat Rumus Nilai Akhir
        double nilaiAkhir1, nilaiAkhir2;
        nilaiAkhir1 = nilaiUts1 * 0.30 + nilaiUas1 * 0.40 + nilaiTugas1 * 0.30 +nilaiKuiz1 *0.10;
        nilaiAkhir2 = nilaiUts2 * 0.30 + nilaiUas2 * 0.40 + nilaiTugas2 * 0.30 +nilaiKuiz2 *0.10;

        // Menentukan Nilai Huruf Mata kuliah 1
        String nilaiHuruf1;
        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            nilaiHuruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            nilaiHuruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            nilaiHuruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            nilaiHuruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            nilaiHuruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            nilaiHuruf1 = "D";
        } else {
            nilaiHuruf1 = "E";
        }

        // Menentukan Nilai Huruf Mata Kuliah 2
        String nilaiHuruf2;
        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            nilaiHuruf2 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            nilaiHuruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            nilaiHuruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            nilaiHuruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            nilaiHuruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            nilaiHuruf2 = "D";
        } else {
            nilaiHuruf2 = "E";
        }

        // Menentukan Status Dari Nilai Akhir
        double status1, status2;
        status1 = nilaiAkhir1;
        status2 = nilaiAkhir2;

        // Menentukan Output Status
        if (status1 >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        if (status2 >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        String statusSemester;
        double rataRataNilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2.0;
        if (status1 >= 60 && status2 >= 60) {
            System.out.println("Semester lulus");
            if (rataRataNilaiAkhir >= 70) {
                statusSemester = "Lulus";
            } else {
                statusSemester = "Tidak Lulus (Rata Rata Kurang Dari 70)";
            }
        } else {
            statusSemester = ("Semester Tidak Lulus");
        }

        // Hasil Dari Seluruh Program
        System.out.println("===Hasil Penilaian Akademik====");
        System.out.println("Nama =" + namaMahasiswa);
        System.out.println("Nim =" + nimMahasiswa);
        System.out.println("-----------------------------");
        System.out.println("==Mata Kuliah==");
        System.out.println("1.Algoritma Dan Pemprograman");
        System.out.println("UTS =" + nilaiUts1);
        System.out.println("Nilai Kuiz =" +nilaiKuiz1);
        System.out.println("UAS =" + nilaiUas1);
        System.out.println("Tugas =" + nilaiTugas1);
        System.out.println("Nilai Akhir =" + nilaiAkhir1);
        System.out.println("Nilai Huruf =" + nilaiHuruf1);
        System.out.println("2.Struktur Data");
        System.out.println("UTS =" + nilaiUts2);
        System.out.println("Nilai Kuiz = " +nilaiKuiz2);
        System.out.println("UAS =" + nilaiUas2);
        System.out.println("Tugas =" + nilaiTugas2);
        System.out.println("Nilai Akhir =" + nilaiAkhir2);
        System.out.println("Nilai Huruf =" + nilaiHuruf2);
        System.out.println("-------------------------------");
        System.out.println("Rata Rata Nilai AKhir =" + rataRataNilaiAkhir);
        System.out.println("Status Semester =" + statusSemester);

        sc.close();
    }

}
