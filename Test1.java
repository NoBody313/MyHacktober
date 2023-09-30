import java.util.Scanner;

public class Test1 {

    public Test1() {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Buat objek Scanner

        int angkaPertama;
        int angkaKedua;

        System.out.print("Masukkan Angka Pertama: ");
        angkaPertama = scan.nextInt();
        System.out.print("Masukkan Angka Kedua: "); // Menggunakan System.out.print
        angkaKedua = scan.nextInt();

        System.out.println("Angka Pertama: " + angkaPertama); // Menambahkan pesan atau label
        System.out.println("Angka Kedua: " + angkaKedua); // Menambahkan pesan atau label
    }
}
