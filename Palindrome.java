public class Palindrome {
    public static boolean isPalimdrome(String str){

        for(int i = 0;i< str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "noon";
        String str2 = "racecar";
        String str3 = "marks";

        System.out.println(isPalimdrome(str2));
    }
}
