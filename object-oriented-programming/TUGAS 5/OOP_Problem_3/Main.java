import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //penjumlahan
        Penjumlahan hitungTambah = new Penjumlahan();
        //pengurangan
        Pengurangan hitungKurang = new Pengurangan();
        //perkalian
        Perkalian hitungKali = new Perkalian();
        //pembagian
        Pembagian hitungBagi = new Pembagian();

        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka 1");
        int input1 = input.nextInt();
        System.out.println("masukan angka 2");
        int input2 = input.nextInt();
        input.close();

        hitungTambah.setAngka1(input1);
        hitungTambah.setAngka2(input2);
        hitungTambah.getHasil();

        hitungKurang.setAngka1(input1);
        hitungKurang.setAngka2(input2);
        hitungKurang.getHasil();

        hitungKali.setAngka1(input1);
        hitungKali.setAngka2(input2);
        hitungKali.getHasil();

        hitungBagi.setAngka1(input1);
        hitungBagi.setAngka2(input2);
        hitungBagi.getHasil();

    }
}