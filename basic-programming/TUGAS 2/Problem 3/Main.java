import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int bilangan = input.nextInt();

       for(int iterasi=1;iterasi<=bilangan;iterasi++){
            if (bilangan % iterasi  == 0){
                System.out.println(iterasi);
            }
       }
    }
}