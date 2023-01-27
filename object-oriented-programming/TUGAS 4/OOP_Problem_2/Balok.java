public class Balok {
    int panjang,lebar,tinggi;
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public int volumeBalok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;

        int hasil = panjang*lebar*tinggi;
        return hasil;
    }
    public void displayVolume(){
        System.out.println("Volume balok = " + volumeBalok(this.panjang, this.lebar, this.tinggi));
    }
}
