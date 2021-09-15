package javaNotes;

public class LoopNotes {
    public static void main(String[] args) {
        foriLooper(8);
        whileLooper();
        pyramid(5);

        reversePyramid(5);
    }

    public static void foriLooper(int someNumber) {
        for (int i = 0; i < someNumber; i++) {
            System.out.println("Alper");
            System.out.println("\uD83D\uDC9B");
            System.out.println("Melisa");
            System.out.println(i);
        }
    }
    public static void whileLooper () {
        int melisasAge = 6;
        int n = 0;
        while (melisasAge < 270) {
            System.out.println("Melisa is currently " + melisasAge + " years old.");
            n += 1;
            melisasAge += n;
        }
    }
    public static void pyramid (int numberFloors) {
        int floorNumber = 0;
        String buildBlock = "?";
        String floor = "start";
        while (floorNumber < numberFloors) {
            System.out.println(floor);
            floor += buildBlock;
            floorNumber += 1;
        }

    }
    public static void reversePyramid (int numberFloors) {
        String buildBlock = "*";
        for (int i = 0; i < numberFloors; i++) {
            String floor = "";

            for (int j = 0; j < numberFloors - i; j++) {
                floor += buildBlock;
            }
            System.out.println(floor);
        }

    }
}
