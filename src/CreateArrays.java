import java.util.Arrays;

public class CreateArrays {
    public static void main(String[] args) {
        int[] fiveNumbers = {1, 2, 3, 4, 5};
        String[] sevenStrings = {"one", "two", "three", "four", "five", "six", "seven"};
        char[] fiveChars = {'1', '2', 'C', 'D', 'E'};
        boolean[] twoBooleans = new boolean [2];

        // alternate initialization method
        twoBooleans[0] = true;
        twoBooleans[1] = false;

        System.out.println("fiveNumbers: " + Arrays.toString(fiveNumbers));
        System.out.println("sevenStrings: " + Arrays.toString(sevenStrings));
        System.out.println("fiveChars: " + Arrays.toString(fiveChars));
        System.out.println("twoBooleans: " + Arrays.toString(twoBooleans));
    }
}
