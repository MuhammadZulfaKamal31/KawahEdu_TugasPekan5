public class Operator {
    double jarijari;
    double panjang;
    double lebar;
    double tinggi;

    public Operator(double r) {
        jarijari = r;
    }

    public Operator(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    // menghitung luas lingkaran
    public double luaslingkaran() {
        return Math.PI * jarijari * jarijari;
    }

    // menghitung luas balok
    public double luasbalok() {
        return panjang * lebar * tinggi;
    }

}
