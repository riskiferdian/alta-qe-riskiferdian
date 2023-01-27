public class Tabung {
    int jari2,tinggi;
    public Tabung(int jari2, int tinggi){
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }
    public int volumeTabung(int jari2, int tinggi){
        this.jari2 = jari2;
        this.tinggi = tinggi;

        int hasil = (22*jari2*jari2/7)*tinggi;
        return hasil;
    }
    public void displayVolume(){
        System.out.println("Volume tabung = " + volumeTabung(this.jari2, this.tinggi));
    }
}
