import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int studentScore = input.nextInt();

        if (studentScore >= 80 && studentScore <= 100) {
            System.out.println("Nilai A");
        } else if (studentScore >= 65 && studentScore <= 79) {
            System.out.println("Nilai B+");
        } else if (studentScore >= 50 && studentScore <= 64) {
            System.out.println("Nilai B");
        } else if (studentScore >= 35 && studentScore <= 49) {
            System.out.println("Nilai C");
        } else if (studentScore >= 0 && studentScore <= 34) {
            System.out.println("Nilai D");
        } else {
            System.out.println("invalid");
        }
    }
}