import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ongkir hitung = new Ongkir();

        Scanner input = new Scanner(System.in);
        System.out.println("masukan berat (kg) : ");
        float beratBarang = input.nextFloat();
        System.out.println("masukan panjang (cm) : ");
        int panjangBarang = input.nextInt();
        System.out.println("masukan lebar (cm) : ");
        int lebarBarang = input.nextInt();
        System.out.println("masukan tinggi (cm) : ");
        int tinggiBarang = input.nextInt();

        hitung.setVolume(panjangBarang,lebarBarang,tinggiBarang);
        hitung.setBerat(beratBarang);
        System.out.println("berat barang  = " + hitung.getBerat() + " Kg");
        System.out.println("volume barang  = " + hitung.getVolume() + " Cm3");
        hitung.getOngkir();

    }
}