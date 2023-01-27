public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3,4);
        Persegi persegi = new Persegi(4);
        PersegiPanjang persegiPanjang = new PersegiPanjang(7,8);

        // Keliling
        persegi.displayKeliling();
        segitiga.displayKeliling();
        persegiPanjang.displayKeliling();

        // Luas
        persegi.displayLuas();
        segitiga.displayLuas();
        persegiPanjang.displayLuas();
    }
}