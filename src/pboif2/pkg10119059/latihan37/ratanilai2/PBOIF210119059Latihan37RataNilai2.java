/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan rata-rata nilai OO
 */
package pboif2.pkg10119059.latihan37.ratanilai2;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan37RataNilai2 {

    public static void main(String[] args) {
        
        
        Nilai nilai = new Nilai();
        
        nilai.inputNilai();
        nilai.nilaiMahasiswa();
        System.out.println("Rata=rata nilainya adalah : " + nilai.rataRataNilai());
    }
}
