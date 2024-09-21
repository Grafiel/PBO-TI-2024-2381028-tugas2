import java.util.Scanner;

public class tugas2 {
    public static double hitungPersegi(double sisi) {
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
        return luas;
    }
    public static double hitungPersegiPanjang(double panjang, double lebar) {
        double luas = panjang * lebar;
        double keliling = panjang + lebar + panjang + lebar;
        System.out.println("Luas  persegi panjang: " + luas);
        System.out.println("keliling persegi panjang: " + keliling);
        return luas;
    }
    public static double hitungLingkaran(double jarijari) {
        double luas = Math.PI * (jarijari * jarijari);
        double keliling = 2 * Math.PI * jarijari;
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bangun datar: ");

        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukkan sisi persegi: ");
            double sisi = input.nextDouble();
            hitungPersegi(sisi);
        } else if (pilihan == 2) {
            System.out.println("Masukan panjang persegi panjang: ");
            double panjang = input.nextDouble();
            System.out.println("Masukan lebar persegi panjang: ");
            double lebar = input.nextDouble();
            System.out.println();
            hitungPersegiPanjang(panjang, lebar);
        } else if (pilihan == 3) {
            System.out.println("Masukan jari-jari lingkaran: ");
            double jarijari = input.nextDouble();
            hitungLingkaran(jarijari);
        }
    }
}
