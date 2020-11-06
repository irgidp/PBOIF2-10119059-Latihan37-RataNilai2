/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan rataRataNilai OO
 */
package pboif2.pkg10119059.latihan37.ratanilai2;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;


public class Nilai {
    Scanner input = new Scanner(System.in);
    int i, nilai;
    float jumlah,x;
    
    public int inputNilai() {
        System.out.print("Masukkan banyaknya mahasiswa  : ");
        return nilai = input.nextInt();
    }
    
    public int nilaiMahasiswa() {
        i=1;
            while (i<=nilai){
                    System.out.print("Nilai Mahasiswa ke-"+i+": ");
                    x= input.nextFloat ();
                    jumlah += x;
                    i++;
            }
            return (int) jumlah;
    }
    
    public int rataRataNilai() {
        return (int) (jumlah / nilai);
    }
}
