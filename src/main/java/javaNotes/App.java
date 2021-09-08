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

        Integer myAge = 31;
        int hisAge = 30;

        boolean ageComparison = myAge > hisAge;
        System.out.println(ageComparison);

        if (ageComparison) {
            System.out.println("I am older than Alper");
        }
        else if (myAge==hisAge) {

            System.out.println("We are the same age");
        }
        else {
            System.out.println("Alper is older than I am");
        }

        int result =  sumOperation(myAge,hisAge) + sumOperation(4,9);

        System.out.println(result);
        System.out.println(subOperation(myAge, hisAge));
        System.out.println(divOperation(myAge, 2));
        System.out.println(fourOperations(myAge,hisAge, "sub"));
        System.out.println(fourOperations(myAge,hisAge, "multi"));
        System.out.println(fourOperations(myAge,hisAge, "div"));
        System.out.println(fourOperations(myAge,hisAge, "mehmet"));
        System.out.println(tasteDetermin("banana"));
        System.out.println(relationDetermin("Orhan"));
        System.out.println(licenceDetermin("Alper"));
        candidateAgeDetermin (18);
        bmiDetermin (55,165);
    }

    public static int sumOperation(int number1, int number2) {
        return number1 + number2;
    }

    public static int subOperation(int number1, int number2) {
        return number1 - number2;
    }

    public static int divOperation (int number1, int number2) {
        return number1 / number2;
    }


    public static int fourOperations(int number1, int number2, String operations){
        switch (operations) {
            case "sub":
                return number1 - number2;

            case "div":
                return number1 / number2;

            case "sum":
                return number1 + number2;

            case "multi":
                return number1 * number2;

            default:
                System.out.println("No such operation type was defined");
                return 0;

        }
// TODO: tek input alan metod meyve adi yaziacak, switch ile meyve eksi mit tatli mi en az 5 meyve


    }

    public static String tasteDetermin(String taste) {
        switch (taste) {
            case "apple":

            case "erik":
                return "sour";

            case "banana":

            case "strawberry":

            case "peach":
                return "sweet";

            default:
                System.out.println("No such taste type was defined");
                return null;
        }


    }

    // TODO akrabaga ismi yazinca iliskisi yazacak


    public static String relationDetermin(String relation) {
        switch (relation) {

            case "Alper":
                return "spouse";

            case "Timur":
                return "brother";

            case "Martina":

            case "Orhan":
                return "parent";

            default:
                System.out.println("No such relative type was defined");
                return null;

        }
    }

    // TODO herkesin yasi kayitli metoda isim yolladiginda yasa gore ehliyet alabilir mi

   public static boolean licenceDetermin(String licence) {
        switch (licence){
            case "Melisa":
                return 27 > 18;

            case "Alper":
                return 30 > 18;

            case "Sissi":
                return 8 > 18;


            default:
                System.out.println("No such licence type was defined");
                return false;


        }

   }

   // TODO yas 18"den buyukse ehliyet alabilir kucukse alamaz

    public static void candidateAgeDetermin (int candidateAge){
        if (candidateAge >= 18) {
            System.out.println("Can have licence");
        }

        else {
            System.out.println("can't have licence");

        }

    }


    //TODO 2 sayi boy ve kilo BMI hesaplayip ona kategori

    public static void bmiDetermin(int weight, int height) {
        if ((weight*10000)/ (height*height) < 18) {
            System.out.println("Underweight");
        }

        else if ((weight*10000)/ (height*height) <= 25) {
            System.out.println("Healthy Weight");
        }

        else if ((weight*10000)/ (height*height) < 30) {
            System.out.println("Overweight");
        }

        else {
            System.out.println("Obesity");
        }


    }
}



