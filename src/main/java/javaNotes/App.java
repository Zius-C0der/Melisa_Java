package javaNotes;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        String myName = "Zius1";
        String hisName = "Gunslinger";
        System.out.println(myName + "&"+ hisName);

        Integer myAge = 27;
        int hisAge = 30;

        boolean ageComparison = myAge > hisAge;
        System.out.println(ageComparison);

        int result =  sumOperation(myAge,hisAge) + sumOperation(4,9);

        System.out.println(result);
    }

    public static int sumOperation(int number1, int number2) {
        return number1 + number2;
    }
}
