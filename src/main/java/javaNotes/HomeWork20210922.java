package javaNotes;



public class HomeWork20210922 {

    public static void main(String[] args) {
        //theHunderdChecker();

        phoneNumberChecker("11111");
    }

    public static void theHunderdChecker(Integer[] inpuntNumbers) {
        for (int number : inpuntNumbers) {
            if (number >= 100)
                System.out.println(number + "this number is over or equal to 100");

            else
                System.out.println(number + "this number is under 100");
        }
         Integer[] numbersList = {1, 56, 65, 102, 100, 99, 123029};
         Integer[] numbersList2 = {32, 546, 644345, -32, 33333333};
    }

    public static void phoneNumberChecker(String testNumber) {
        String[] phoneNumbers ={"02930", "11111", "12345", "29403"};
        for (String phoneNumber:phoneNumbers) {
            boolean condition = phoneNumber.equalsIgnoreCase(testNumber);
            if (condition) {
                System.out.println("your phone number is in the list");
                return;
            }
        }
        System.out.println("your phone number is NOT in the list");
    }

}

    // TODO int Array rastgele sayilar loop ile sayilar 100"den kucuk mu buyuk mu
    // TODO telefn numaralari listesi 4-5 haneli input olarak gelen numara telefon listesi numarasinda var mi

