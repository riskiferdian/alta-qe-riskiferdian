public class Paket {
    int panjang,lebar,tinggi, ongkir;
    float berat;

    public void setBerat(float berat) {this.berat=berat;}
    public float getBerat() {return berat;}

    public void setVolume(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public int getVolume(){
        return this.panjang*this.lebar*this.tinggi;
    }
}
