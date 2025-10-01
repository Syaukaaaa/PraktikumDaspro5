import java.util.Scanner;
 public class IfCetakKrs27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Cetak KRS SIAKAD==");
        System.out.println("Apakah Ukt Sudah Lunas ? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran Ukt Lunas");
            System.out.println("Silahkan Cetak KRS dan Minta Tanda Tangan DPA");
            
        }
    }
 }