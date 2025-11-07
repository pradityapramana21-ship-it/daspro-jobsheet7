import java.util.Scanner;
public class bioskop23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hargaTiket = 50000;    
        int jumlahTiket;   
        double totalPendapatan = 0;
        
        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("Ketik angka negatif untuk mengakhiri program.");;
        
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }
            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket tidak boleh 0. Coba lagi.\n");
                continue;
            }
            double totalHarga = jumlahTiket * hargaTiket;
             double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15 * totalHarga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * totalHarga;
            }
            
            totalHarga -= diskon;
            totalPendapatan += totalHarga;
            
     System.out.println("Diskon: Rp " + diskon);
     System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
     System.out.println("----------------------------------------");     
        } while (true); 
     System.out.println("\n=== Rangkuman Penjualan Hari Ini ===");
     System.out.println("Total pendapatan: Rp " + totalPendapatan);
    }
}
    

