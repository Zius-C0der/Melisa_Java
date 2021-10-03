package javaNotes;

import java.util.Scanner;

import static javaNotes.LoopNotes.pyramid;
import static javaNotes.LoopNotes.reversePyramid;
import static javaNotes.MethodAndSwitchNotes.bmiDetermin;

public class ScannerNotes {

    public static void main(String[] args) {
        bmiScanner();
        reversePyramidScammer();
    }

    public static void bmiScanner ( ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        int weight = scanner.nextInt();
        System.out.println("Enter height");
        int height = scanner.nextInt();
        scanner.close();
        bmiDetermin (weight, height);
    }
    public static void reversePyramidScammer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of floors");
        int floorNumber = scanner.nextInt();
        System.out.println("Enter Buildblock");
        String buildBlock = scanner.next();
        reversePyramid (floorNumber,buildBlock);
        pyramid(floorNumber, buildBlock);
    }




}
