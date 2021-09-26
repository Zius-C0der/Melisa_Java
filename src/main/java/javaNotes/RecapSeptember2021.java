package javaNotes;

import java.util.ArrayList;
import java.util.List;

public class RecapSeptember2021 {
    // "public class [Classİsmi]" şeklinde class açıyoruz. Bunun altına istediğimiz kadar method ekleyebiliriz.
    // class isimleri büyük harf ile başlayıyor ve her yeni kelime büyük harfle başlıyor.

    public static void main(String [] args) {
        // 'main' methodunun altında diğer methodlarda yazdığımız fonksiyonları çağırıyoruz.
        // Şimdiye kadar hep birebir yukarda yazıdlığı gibi yazdık main methodunu.
        // class isimleri küçük harf ile başlayıyor ve her yeni kelime büyük harfle başlıyor.

        // main methodunda her zaman 'void' yazıyor.Yazdığımız diğer fonksiyonlar için farklı şeyler yazıyor:
        // Matematik işlem yapılmayanlar: 'String'
        // Tamsayılar: 'int'
        // Kıyaslama: 'boolean'
        // Diğerlerinde de 'void' kullanılıyor.

        System.out.println("Melisa");
        System.out.println(sumNumbers(4,2));
        System.out.println(colorDetermin("apple"));
        listFlowers();
        authorChooser("Andreas Eschbach");

    }

    public static int sumNumbers(int number1, int number2){
        return number2 + number1;
    }

    public static String colorDetermin (String color) {
        switch (color) {
            case "apple":
                return "red";

            case "erik":
                return "green";

            case "banana":
                return "yellow";

            default:
                System.out.println("no such color was defined");
                return null;
        }
    }
    public static void listFlowers() {
        String [] stringArray={"daisy", "rose","sunflower","tulip", "lily","orchid"};
        for (String item:stringArray) {
            System.out.println(item);
        }
    }
    public static String[] authors= {"Andreas Eschbach", "Tim Ferris", "Issac Assimov", "Sarah Lark"};
    public static void authorChooser (String name) {
        for (String author:authors){
            boolean condition = author.equalsIgnoreCase(name);
            if (condition){
                System.out.println("This is one of my favorite authors");
                return;
            }
        }
        System.out.println("I don't like this author");
    }

}
