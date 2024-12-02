import java.util.*;

public class StringTuto {

    public static void printString(String str){
        String vowels = " ";

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch== 'e' || ch =='i' || ch == 'o' || ch =='u'){
                vowels += ch;
            }
        }
        System.out.println(vowels + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printString(name);
    }
}