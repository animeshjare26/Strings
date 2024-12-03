public class LargestString {
    
    public static void main(String[] args) {
        
        String fruits[] = {"apple","mango","banana"};

        String largest = fruits[0];

        for(int i = 1;i< fruits.length;i++){
            if((largest.compareTo(fruits[i])<0)){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}


//ouput : mango ..because lexically mango comes after b so even if length-wise "banana" is bigger , lexically mango is greater


//compareTo method returns
//0 if both strings are equal
// negative value when 1st str > 2nd str
// positive value when 2nd str > 1st str 