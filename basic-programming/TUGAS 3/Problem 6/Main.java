public class Main {
    private static void draw(int height) {
        int i = 0;
        boolean temp = true;

        do {
            i++;
            if (i == height * height) {
                temp = false;
            }
            if(i%3 == 0){
                System.out.print("X");
            } else if (i%2==0) {
                System.out.print("Z");
            }else{
                System.out.print("Y");
            }
            if (i%height == 0){
                System.out.print("\n");
            }
        }while(temp);
    }
    public static void main (String[]args){
        draw(5);
    }
}
