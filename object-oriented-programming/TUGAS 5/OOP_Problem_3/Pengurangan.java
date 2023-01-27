 public class Pengurangan extends Kalkulator{
        public double kurang(){
            return this.angka1-this.angka2;
        }

        public void getHasil(){
            System.out.println("kurang = " + kurang());
        }
    }
