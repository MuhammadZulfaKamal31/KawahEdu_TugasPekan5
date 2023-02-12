import java.util.Scanner;

public class TugasKetiga {

    public static void main(String[] args) {
        // a. Buatlah program untuk input nama anda dan output kalimat "Selamat datang
        // di bootcamp Kawah Edukasi, {namaAnda}"
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Silahkan masukan nama anda : ");
        String nama = inputUser.nextLine();
        System.out.println("===============================================================");
        System.out.println("Selamat datang di bootcamp Kawah Edukasi " + nama);
        System.out.println("===============================================================");
        System.out.println("");

        // b. Buatlah masing masing dua variable untuk data type short, double, char,
        // dan boolean
        short short1 = 15;
        short short2 = 20;
        double double1 = 34.56;
        double double2 = 35;
        char char1 = 'A';
        char char2 = 'B';
        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println("Beberapa contoh 4 tipe data yang ada di java..");
        System.out.println("----------------------------------------------");
        System.out.println("Short : " + short1 + "         Short : " + short2);
        System.out.println("Double : " + double1 + "     Double : " + double2);
        System.out.println("Chart : " + char1 + "          Chart : " + char2);
        System.out.println("Boolean : " + boolean1 + "     Boolean : " + boolean2);

        // c. Buatlah 3 variable string dengan value masing-masing, "Saya senang"
        // "belajar" "Java Language", lalu gabungkan dan print hasilnya.
        String str1 = "Saya senang";
        String str2 = " belajar ";
        String str3 = "Java Language";
        String strGabungan = str1 + str2 + str3;
        System.out.println("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Gabungan string: " + strGabungan);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        // a. Implentasi rumus luas lingkaran dan volume balok pada bahasa Java
        Scanner jarijari = new Scanner(System.in);
        System.out.println("Rumus untuk menghitung luas lingkaran");
        System.out.println("-------------------------------------------------");
        System.out.print("Silahkan masukan jari jari lingkaran anda : ");
        double jari = jarijari.nextDouble();
        Operator lingkaran = new Operator(jari);
        System.out.println("");
        System.out.println("jadi untuk luas lingkaran adalah = " + lingkaran.luaslingkaran());
        System.out.println("");

        Scanner inputbalok = new Scanner(System.in);
        System.out.println("");
        System.out.println("Rumus untuk menghitung luas balok");
        System.out.println("--------------------------------------------------");
        System.out.print("Silahakan masukan Panjang balok : ");
        double panjangBalok = inputbalok.nextDouble();
        System.out.print("Silahkan masukan lebar balok : ");
        double lebarBalok = inputbalok.nextDouble();
        System.out.print("Silahakan masukan tinggi balok : ");
        double tinggiBalok = inputbalok.nextDouble();
        Operator balok = new Operator(panjangBalok, lebarBalok, tinggiBalok);
        System.out.println("");
        System.out.println("jadi untuk luas balok adalah " + balok.luasbalok());
    }

}
