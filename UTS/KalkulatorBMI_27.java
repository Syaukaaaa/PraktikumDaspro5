import java.util.Scanner;
public class KalkulatorBMI_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    // Deklarasi Dan Penggunaan Scanner
    System.out.println("Tinggi Badan Pasien =");
    double tinggiBadan=sc.nextDouble();
    System.out.println("Masukkan Berat Badan");
    double beratBadan=sc.nextDouble();
    // Perhitungan BMI
    double bmi;
    bmi = beratBadan/ (tinggiBadan*tinggiBadan);
    if (bmi<18.5) {
        System.out.println("Kurang Berat Badan (underweight)");
        System.out.println(" Risiko Kesehatan = Kekurangan Gizi,Osteoporosis,Penurunan Imun Tubuh");  
    } else if (bmi<25&&bmi>=18.5) {
        System.out.println("Berat Badan Normal");
        System.out.println("Resiko Kesehatan = Relatif Rendah");
    } else if (bmi<30&&bmi>=30) {
        System.out.println("Kelebihan Berat Badan (Overweight)");
        System.out.println("Resiko Kesehatan =Penyakit Jantung,Darah Tinggi,Diabetes");
    } else{
    System.out.println("Inputan Tidak Sesuai Dengan Program");
    }
    // Hasil Output 
    System.out.println("Keterangan Body Mass Indexx =" +bmi);
    System.out.println("Berat Badan Pasien Adalah =" +beratBadan +"Kg");
    System.out.println("Tinggi Badan Pasien Adalah =" + tinggiBadan +"M");
   
    
    }
    
}
