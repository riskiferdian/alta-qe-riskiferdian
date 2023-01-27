public class Kubus {
    int sisi;
    public Kubus(int sisi){
        this.sisi = sisi;
    }
    public int volumeKubus(int sisi){
        this.sisi = sisi;
        int hasil = sisi*sisi*sisi;
        return hasil;
    }
    public void displayVolume(){
        System.out.println("Volume kubus = " + volumeKubus(this.sisi));
    }
}
