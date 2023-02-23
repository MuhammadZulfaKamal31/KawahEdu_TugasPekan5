import java.util.Scanner;

public class MainTugas5 {
    public static void hitungBidangTanah(BidangTanah bidangTanah) {
        System.out.println("");
        System.out.println("Bidang Tanah:");
        System.out.println(bidangTanah.getClass().getSimpleName());
        System.out.println("Luas: " + bidangTanah.luas());
        System.out.println("Keliling: " + bidangTanah.keliling());
        System.out.println();
    }

    public static void main(String[] args) {

        Persegi persegi = new Persegi(5);
        hitungBidangTanah(persegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        hitungBidangTanah(persegiPanjang);

        Segitiga segitiga = new Segitiga(10, 7, 9, 8, 10);
        hitungBidangTanah(segitiga);

        Lingkaran lingkaran = new Lingkaran(7);
        hitungBidangTanah(lingkaran);
    }
}
