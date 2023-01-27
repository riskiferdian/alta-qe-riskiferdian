 public class Pembagian extends Kalkulator {
     public float bagi() {
         float hasil = (float)this.angka1/this.angka2;

         if (this.angka2 != 0) {
             return hasil;
         } else {
             return 0;
         }
     }
        public void getHasil(){
            float hasil = bagi();
            if(hasil == 0){
                System.out.println("infinity");
            }else{
                System.out.println("bagi = " + bagi());
            }

        }

}
