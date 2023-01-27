public class Penjumlahan extends Kalkulator{
    public double tambah(){
        return this.angka1+this.angka2;
    }

    public void getHasil(){
        System.out.println("jumlah  = " + tambah());
    }
}
