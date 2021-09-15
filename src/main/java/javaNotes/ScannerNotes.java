package javaNotes;

import java.util.Scanner;

import static javaNotes.LoopNotes.reversePyramid;
import static javaNotes.MethodAndSwitchNotes.bmiDetermin;

public class ScannerNotes {

    public static void main(String[] args) {
        bmiScanner();
        pyramidScammer();
    }

    public static void bmiScanner ( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        int weight = scanner.nextInt();
        System.out.println("Enter height");
        int height = scanner.nextInt();
        bmiDetermin (weight, height);
    }
    public static void pyramidScammer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of floors");
        int floorNumber = scanner.nextInt();
        reversePyramid (floorNumber);

    }
        // Scanner pyramid ama buildblocks terminalden girilsin
    //   * böyle piramid
    //  ***
    // *****
    //*******

}
