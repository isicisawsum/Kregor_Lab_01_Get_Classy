public class ObjInputTest {
    public static void main(String[] args) {
        // Creates instance of SafeiNputObj
        SafeInputObj inputObj = new SafeInputObj();

        // now able to use methods from SafeInputObj
        String nonZeroString = inputObj.getNonZeroLenString("Enter a nonzerolengthstring string");
        System.out.println("You entered: " + nonZeroString);

        int rangedInt = inputObj.getRangedInt("Enter a number between 1 and 10", 1, 10);
        System.out.println("You entered: " + rangedInt);

        int anyInt = inputObj.getInt("Enter any integer");
        System.out.println("You entered: " + anyInt);

        double rangedDouble = inputObj.getRangedDouble("Enter a number between 1.0 and 10.0", 1, 10);
        System.out.println("You entered: " + rangedDouble);

        boolean ynConfirm = inputObj.getYNConfirm("Do you want to continue?");
        System.out.println("Your answer was: " + (ynConfirm ? "Yes" : "No"));

        String regexString = inputObj.getRegExString("Enter a string matching [a-z]+", "[a-z]+");
        System.out.println("You entered: " + regexString);
    }
}
