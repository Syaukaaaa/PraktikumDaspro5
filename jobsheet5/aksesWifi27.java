import java.util.Scanner;

public class aksesWifi27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Masukan Jenis Pengguna (Dosen/Mahasiswa)");
        String jenisPengguna=sc.nextLine();
    if (jenisPengguna.equals("Mahasiswa")) {
    System.out.println("Masukkan Jumlah SKS Yang Diambil");
        int sks = sc.nextInt();
        if (sks>=12) {
        System.out.println("Akses Wifi diberikan (mahasiswa aktif ) ");
        }else  if (sks==12) {
        System.out.println("Akses Wifi diberikan (mahasiswa aktif");
        }else 
        System.out.println("Akses Wifi Ditolak, Sks kurang dari 12");
            
        } else if  (jenisPengguna.equals("Dosen")) {
        System.out.println("Akses Wifi Diberikan");
      } else {
      System.out.println("Akses Ditolak Pengguna Tidak Dikenali");
      }
      sc.close();
    }
}    
            
        
    
    
        
    
          
             
            

    
    

