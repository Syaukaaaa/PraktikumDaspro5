import java.util.Scanner;
public class BilanganTerbesar_27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Masukkan Bilangan pertama =");
    int bilanganPertama=sc.nextInt();
    System.out.println("Masukkan Bilangan Kedua =");
    int bilanganKedua=sc.nextInt();
    System.out.println("Masukkan Bilangan Ketiga =");
    int bilanganKetiga=sc.nextInt();

    if (bilanganPertama>bilanganKedua && bilanganPertama>bilanganKetiga){
    System.out.println("Bilangan Pertama Merupakan Angka terbesar =" +bilanganPertama); 
    }else if (bilanganKedua>bilanganPertama&&bilanganKedua>bilanganKetiga) {
    System.out.println("Bilangan Kedua Merupakan Angka Terbesar =" + bilanganKedua);
     }else if (bilanganKetiga>bilanganPertama&&bilanganKetiga>bilanganKedua){
    System.out.println("Bilangan Ketiga Adalah Angka Terbesar =" +bilanganKetiga);
     } else {
        System.out.println("Ada Nilai Besar Yang Sama");
        if (bilanganPertama==bilanganKedua&&bilanganPertama>bilanganKedua) {
        System.out.println("Angka Terbesar Sama Yaitu Bilangan 1&2 =" +bilanganPertama );
        }else if (bilanganPertama==bilanganKetiga&&bilanganPertama>bilanganKedua) {
        System.out.println("Angka Terbersar Sama Yaitu Bilangan 1&3 =" +bilanganPertama);    
        }else if (bilanganKedua==bilanganKetiga&&bilanganKedua>bilanganPertama) {
        System.out.println("Angka Terbesar Sama Yaitu Bilangan 2&3 =" +bilanganKedua );
        }else if (bilanganPertama==bilanganKedua&&bilanganPertama==bilanganKetiga) {
        System.out.println("Semua Bilangan Bernilai Sama =" +bilanganPertama);
         }
    }     
}   }
