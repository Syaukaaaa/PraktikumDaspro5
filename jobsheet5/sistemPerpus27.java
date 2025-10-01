import java.util.Scanner;
public class sistemPerpus27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Apakah Membawa Kartu Mahasiswa");
        boolean bawaKtm = sc.nextBoolean();

        System.out.println("Apakah Sudah Registrasi Online");
        boolean regisOnline= sc.nextBoolean();

        if (bawaKtm || regisOnline) {
            System.out.println("Dipersilahkan Masuk");
        } else{
            System.out.println("Dilarang Masuk");
        
        sc.close();
            
        }
    }
    
}
