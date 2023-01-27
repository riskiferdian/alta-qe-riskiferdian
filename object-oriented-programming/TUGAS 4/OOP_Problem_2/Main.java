import javafx.scene.control.Tab;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3,6,10);
        Tabung tabung = new Tabung(7,10);

        kubus.displayVolume();
        balok.displayVolume();
        tabung.displayVolume();
    }
}