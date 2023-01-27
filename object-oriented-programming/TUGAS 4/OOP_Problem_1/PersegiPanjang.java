public class PersegiPanjang {
    int panjang, lebar;
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public int luasPersegiPanjang(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;

        int hasil = panjang*lebar;
        return hasil;
    }
    public int kelilingPersegiPanjang(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;

        int hasil = 2*(panjang+lebar);
        return hasil;
    }
    public void displayKeliling(){
        System.out.println("Keliling persegi panjang : " + kelilingPersegiPanjang(this.panjang,this.lebar));
    }
    public void displayLuas(){
        System.out.println("Luas persegi panjang : " + luasPersegiPanjang(this.panjang, this.lebar));
    }
}
