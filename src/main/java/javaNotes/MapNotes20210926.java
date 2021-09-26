package javaNotes;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class MapNotes20210926 {
    //map`te "Key Word" ve "Value" var.  Map <"Key Word","Value> her ikisi de int, String veya baöka bir map de olabilir.

    public static void main(String[] args) {
        familyConnections.put("babam","Orhan");
        familyConnections.put("esim", "Alper");
        familyConnections.put("kedim","Sissi");

        personHeight.put("Melisa",164);
        personHeight.put("Alper",181);
        personHeight.put("Sissi",30);
        personHeight.put("Timur",72);

        System.out.println(familyConnections);
        System.out.println(familyConnections.get("babam"));
        mapLooper();

        fillPeopleMap();
        System.out.println(people);

        heightDetermin();
    }
    public static Map<String,String> familyConnections = new HashMap<>();

    public static Map<String,Integer> personHeight = new HashMap<>();

    // mapi dolu baslatmak icin bu kullanilabilir
    static Map<String, String> test2 = Map.ofEntries(
            entry("a", "b"),
            entry("c", "d")
    );

    //map loop yapmak mumkun degil bu yüzden "Key Set" liste gibi davranabildiginen onu loop yapiyoruz.

    public static void mapLooper(){
        for (String key:familyConnections.keySet()) {
            System.out.println(key + "in adi " + familyConnections.get(key));
        }
    }

    // TODO heiht map burada boy ve kisi ismi map loop boyu 1,75 altinda kisa ustunde olanlar uzun

    public static void heightDetermin() {
        for (String key:personHeight.keySet()) {
            if (personHeight.get(key) > 175){
                System.out.println( key + " you are huge");
            }
            else {
                System.out.println(key + " you are small");
                }
        }
    }

    //Todo Interlaced map: mapte key valuelari birer map (boy, kilo gibi bircok özellik (attributes)

    public static Map<String,Map<String,String>> people = new HashMap<>();

    public static void fillPeopleMap() {
        Map<String,String> attributes = new HashMap<>();
        // for Melisa
        attributes.put("height", "164");
        attributes.put("weight", "54");
        attributes.put("eye color", "green-brown");
        attributes.put("favorite book", "One Billion Dollar");
        attributes.put("age", "27");

        people.put("Melisa", attributes);

        //for Alper
        attributes = new HashMap<>();
        attributes.put("height", "181");
        attributes.put("weight", "100");
        attributes.put("eye color", "darker than black");
        attributes.put("favorite book", "Barbie Book");
        attributes.put("age", "30");

        people.put("Alper",attributes);

        //for Timur
        attributes = new HashMap<>();
        attributes.put("height", "180");
        attributes.put("weight", "80");
        attributes.put("eye color", "light brown yellow");
        attributes.put("favorite book", "no books allowed");
        attributes.put("age", "24");

        people.put("Timur",attributes);
    }



    //TODO people map icerisince tum kisilerin tüm özelliklerini print ama ayri ayri
    //TODO favori kitabi One billon dollar olan kisinin ismini yazdirma methodu
    //TODO boyu 1,80 üzeinde olanalri yazdiran method
    //TODO BMI cok az veya cok fazla olan kisileri göstersin
    //TODO people icerisinden yasi kamyon ehtiyeti alabilenler
    //TODO kisilerin yaslari toplami
    //TODO scanner kullanark konsola isim girilecek sonra attribute girilecek ona göre bilgileri verecek.
}
