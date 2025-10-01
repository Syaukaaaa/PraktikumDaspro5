import java.util.Scanner;
 public class IfCetakKrs27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Cetak KRS SIAKAD==");
        System.out.println("Apakah Ukt Sudah Lunas ? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
         String hasil=(uktLunas)
            ? "Pembayaran UKT Terverivikasi \n Silahkan Cetak KRS dan Minta tanda tangan DPA "
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
            System.out.println(hasil);
            
        }
    }
 