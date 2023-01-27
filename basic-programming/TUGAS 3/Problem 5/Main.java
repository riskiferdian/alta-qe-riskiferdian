public class Main {
    private static boolean palindrome(String kata){
        String temp = "";
        for(int i = kata.length()-1;i>=0;i--){
            temp = temp+kata.charAt(i);
        }

        if(kata.equals(temp)){
            return true;
        }else {
            return  false;
        }

    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}