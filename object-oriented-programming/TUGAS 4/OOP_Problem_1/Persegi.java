public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public int luasPersegi(int sisi){
        this.sisi = sisi;
        int hasil = sisi*sisi;
        return hasil;
    }
    public int kelilingPersegi(int sisi){
        this.sisi = sisi;
        int hasil = 4*sisi;
        return hasil;
    }
    public void displayKeliling(){
        System.out.println("Keliling persegi = " + kelilingPersegi(this.sisi));
    }
    public void displayLuas(){
        System.out.println("Luas persegi = " + luasPersegi(this.sisi));
    }
}
