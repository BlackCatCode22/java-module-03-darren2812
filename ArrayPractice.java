// ArrayPractice.java
// dD 09/09/25

public class ArrayPractice {
    public static void main(String[] args){
        // initializing arrays using two different methods
        String[] words = {"Hello", "There", "Hi", "How are you?"};
        int[] numbers = {1, 2, 3, 4};
        String[] moreWords = new String[4];
        moreWords[0] = "There!";
        moreWords[1] = "Hello";
        moreWords[2] = ", how are you?";
        moreWords[3] = "Doing good?";
        int[] moreNumbers = new int[4];
        moreNumbers[0] = 1;
        moreNumbers[1] = 2;
        moreNumbers[2] = 3;
        moreNumbers[3] = 4;

        // for loop to print out the elements of each array
        for (int i = 0; i < 4; i++){
            System.out.println("words" + "[" + i + "]: " + words[i]);
            System.out.println("numbers" + "[" + i + "]: " + numbers[i]);
            System.out.println("moreWords" + "[" + i + "]: " + moreWords[i]);
            System.out.println("moreNumbers" + "[" + i + "]: " + moreNumbers[i]);
        }
    }
}
