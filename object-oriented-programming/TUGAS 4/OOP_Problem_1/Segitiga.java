import java.lang.Math;
public class Segitiga {
    int alas, tinggi;
    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float luasSegitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;

        int hasil = (alas * tinggi) / 2;
        return hasil;
    }
    public double kelilingSegitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;

        double sisiMiring = Math.sqrt((alas*alas)+(tinggi*tinggi));
        double hasil = alas+sisiMiring+tinggi; // anggap segitiga adalah siku-siku
        return hasil;
    }
    public void displayLuas() {
        System.out.println("luas segitiga = " + luasSegitiga(this.alas, this.tinggi));
    }
    public void displayKeliling(){
        System.out.println("keliling segitiga = " + kelilingSegitiga(this.alas, this.tinggi));
    }

}