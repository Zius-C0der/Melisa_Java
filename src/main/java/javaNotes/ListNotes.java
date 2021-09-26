package javaNotes;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNotes {
    public static String[] invitees={"Alper Cicek", "Melisa Cicek", "Timur Yilmaz", "Umut Bora"};


    public static void main(String[] args) {
       bouncer("Melisa");
       listExample();
    }

    public static void bouncer (String name) {
        for (String invitee:invitees) {
            boolean condition = invitee.equalsIgnoreCase(name);
            if (condition) {
                System.out.println("come in MF");
                return;
            }
        }
        System.out.println("get lost");
    }

    public static void listExample(){
        String[] stringArray={"cup","phone","table"};

        List<String> items= Arrays.asList("cup","phone", "table", "USB", "fork");


        items.add("knife");
        items.add("spoon");
        items.add("cupboard");

        for (String item:items) {
            System.out.println(item);
        }

        for (String item:stringArray) {
            System.out.println(item);

        }


    }

}
