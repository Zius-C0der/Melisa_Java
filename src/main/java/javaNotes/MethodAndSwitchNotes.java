package javaNotes;

public class MethodAndSwitchNotes {

    public static Integer myAge = 31;
    public static int hisAge = 30;


    public static void main(String[] args) {
        System.out.println(fourOperations(myAge,hisAge, "sub"));

        System.out.println(tasteDetermin("banana"));

        System.out.println(relationDetermin("Orhan"));

        System.out.println(licenceDetermin("Alper"));

        bmiDetermin (55,165);
    }



    public static int fourOperations(int number1, int number2, String operations) {
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
    }
    // TODO: tek input alan metod meyve adi yaziacak, switch ile meyve eksi mit tatli mi en az 5 meyve


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
