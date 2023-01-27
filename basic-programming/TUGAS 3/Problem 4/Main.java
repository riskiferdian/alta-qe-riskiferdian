class Main {

    private static boolean primeNumber(int number) {
        int i, count=0;

        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            } else {
                count+=0;
            }
        }

        if(count == 2){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }
}
