import java.util.Scanner;

public class TiketBioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int jumlahTiket, totalTiketHariIni = 0;
        double hargaTiket = 50000;
        double totalPenjualanHarini = 0;
        String pilihan;

       do  {
            System.out.println("Masukkan jumlah tiket yang dibeli");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0){
                System.out.println("Jumlah tiket tidak valid! Tolong masukkan lagi");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4){
                    diskon = 0.10;
            }
            
            double totalBayar = totalHarga - (totalHarga*diskon);

            totalTiketHariIni = totalTiketHariIni + jumlahTiket;
            totalPenjualanHarini = totalPenjualanHarini + totalBayar;

            System.out.println("total yang harus anda bayar: Rp" + totalBayar);
            System.out.println("Apakah ada transaksi lain? (y/t): ");
            pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("t")){
                break;
            }
        } while (true);
        System.out.println("Rekapan penjualan tiket hari ini");
        System.out.println("Total tiket terjual : " + totalTiketHariIni);
        System.out.println("Total uang penjualan :" + totalPenjualanHarini);
        System.out.println("Terima kasih");
    }
}