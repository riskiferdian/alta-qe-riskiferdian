public class Ongkir extends Paket {
    // menghitung ongkir volume (batas volume 50 cm^3)
    // - batas toleransi kelebihan volume adalah 15
    // - contoh : volume 65 masih dianggap volume 50, volume 75 sudah dianggap volume 100
    public int ongkirVolume(){
        int hasil = getVolume();
                if(hasil < 50) {
                    ongkir =  5000;
                    return ongkir;
                }else{
                    int volume = hasil%50;
                    if(volume <= 15){
                        ongkir = (hasil/50) * 5000;
                        return ongkir;
                    } else{
                        ongkir = ((hasil/50)+1) * 5000;
                        return ongkir;
                    }
                }
    }

    // menghitung ongkir berat (batas berat 1 kg)
    // - batas toleransi kelebihan berat adalah 250 gram atau 0,25 kg
    // - contoh : berat 1,25 kg masih dianggap 1 kg, berat 1,4 kg sudah dianggap 2 kg
    public float ongkirBerat() {
        float hasil = getBerat();
        float beratGram = (hasil * 1000);
            if (beratGram < 1000) {
                ongkir = 5000;
                return ongkir;
            }else {
                if (beratGram % 1000 <= 250) {
                    ongkir = (int) hasil * 5000;
                    return ongkir;
                }else {
                    ongkir = ((int) hasil + 1) * 5000;
                    return ongkir;
                }
        }
    }

    // menghitung ongkir berdasar berat dan volume
    public void getOngkir(){
        float ongkirBerat = ongkirBerat();
        float ongkirVolume = ongkirVolume();

        if(ongkirBerat>ongkirVolume){
            System.out.println("Jadi ongkirnya : Rp." + (int)ongkirBerat);
        }else if (ongkirVolume>ongkirBerat) {
            System.out.println("Jadi ongkirnya : Rp." + (int)ongkirVolume);
        }else{
            System.out.println("Jadi ongkirnya : Rp." + (int)ongkirBerat);
        }
    }
}
