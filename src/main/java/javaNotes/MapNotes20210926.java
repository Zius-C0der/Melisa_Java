package javaNotes;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Map.entry;
import static javaNotes.MethodAndSwitchNotes.bmiDetermin;

public class MapNotes20210926 {
    //map`te "Key Word" ve "Value" var.  Map <"Key Word","Value"> her ikisi de int, String veya baska bir map de olabilir.
    // map acma Map<String,String> familyConnections = new HashMap<>();
    // map icini doldurma familyConnections.put("babam","Orhan");

    public static void main(String[] args) {

        fillPeopleMap();
        //System.out.println(people);

        familyConnections.put("babam","Orhan");
        familyConnections.put("esim", "Alper");
        familyConnections.put("kedim","Sissi");

        personHeight.put("Melisa",164);
        personHeight.put("Alper",181);
        personHeight.put("Sissi",30);
        personHeight.put("Timur",72);

        //System.out.println(familyConnections);
        //System.out.println(familyConnections.get("babam"));
        //mapLooper();

        //fillPeopleMap();

       // heightDetermin();

      // peopleAttributesLooper();
        //peopleEyeColorLooper();

        //bookChecker();

        //peopleHeightDetermin();

       //peopleBmiDetermin();

        //happyMap();
        //attributeList();
        //peopleCharacteristic();

       // bookChecker2();

        //truckLicence();

        //ageSum();
        //peopleScanner();

        longestName();
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

    // TODO height map burada boy ve kisi ismi map loop boyu 1,75 altinda kisa ustunde olanlar uzun

    public static void heightDetermin() {
        for (String key:personHeight.keySet()) {
            if (personHeight.get(key) > 175){
                System.out.println( key + " you are tall");
            }
            else {
                System.out.println(key + " you are short");
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

        //for Sissi
        attributes = new HashMap<>();
        attributes.put("height","30");
        attributes.put("weight", "6");
        attributes.put("eye color", "yellow");
        attributes.put("favorite book", "how to kill a mockingbird");
        attributes.put("age", "7");

        people.put("Sissi",attributes);
    }

    //TODO people map icerisince tum kisilerin tüm özelliklerini print ama ayri ayri

    public static void peopleCharacteristic(){
        System.out.println(people);
        System.out.println(people.get("Sissi").get("age"));

    }

    public static void peopleAttributesLooper(){;
        for (String person:people.keySet()) {
            for (String attribute:people.get(person).keySet()) {
                System.out.println(person + " "+ attribute + " " + people.get(person).get(attribute));
            }
        }
    }


    public static void peopleEyeColorLooper(){;
        for (String person:people.keySet()) {
            String eyeColor = people.get(person).get("eye color");
            System.out.println(person + " is " + eyeColor + " eyed.");

        }
    }

    //TODO favori kitabi One billon dollar olan kisinin ismini yazdirma methodu

    public static void bookChecker () {
        for (String key :people.keySet()) {
            boolean condition = people.get(key).get("favorite book").equalsIgnoreCase("One Billion Dollar");
            if (condition) {
                System.out.println(key);
                return;
            }
        }
    }

    public static void bookChecker2 (){
        for (String key:people.keySet()){
            if(people.get(key).containsValue("One Billion Dollar")){
                System.out.println(key);
            }
        }
    }


    //TODO boyu 1,80 üzeinde olanlari yazdiran method

    public static void peopleHeightDetermin() {

        for (String key:people.keySet()) {
            if (TypeConversions20210926.strToInt(people.get(key).get("height")) > 180){
                System.out.println( key + " you are tall");
            }
            else if (TypeConversions20210926.strToInt(people.get(key).get("height")) > 160){
                System.out.println( key + " you are ok");
            }
            else
                System.out.println( key + " you are small");
        }
    }

    //TODO BMI cok az veya cok fazla olan kisileri göstersin

    public static void peopleBmiDetermin() {

        for (String key:people.keySet()) {
            System.out.println(key + ":");
            MethodAndSwitchNotes.bmiDetermin(TypeConversions20210926.strToInt(people.get(key).get("weight")), TypeConversions20210926.strToInt(people.get(key).get("height")));
        }
    }

    // kendi arastirmam

    public static void happyMap(){
        Map<String, Integer> happy = new HashMap<>();
        happy.put("a", 10);
        happy.put("b",3);
        happy.put("c", 88);

        happy.remove("b");
        happy.replace("c",1);

        System.out.println(happy.containsValue(10));
        System.out.println(happy);
        System.out.println(happy.values());
    }

    //TODO people icerisinden yasi kamyon ehtiyeti (21 yas) alabilenler

    public static void truckLicence(){
        for(String key:people.keySet()){
            if (TypeConversions20210926.strToInt(people.get(key).get("age")) > 21) {
                System.out.println(key + " you are able to get a truck licene");
            }
        }
    }


    //TODO kisilerin yaslari toplami
    public static void ageSum(){
        int sum = 0;
        for(String key:people.keySet()){
            sum += TypeConversions20210926.strToInt(people.get(key).get("age"));
        }
        System.out.println(sum);
    }


    //TODO scanner kullanark konsola isim girilecek sonra attribute girilecek ona göre bilgileri verecek
    public static void peopleScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter attribute");
        String attribute = scanner.nextLine();
        scanner.close();

        System.out.println(getAttributeOf(name,attribute));

    }

    public static String getAttributeOf(String name, String attribute){
        return people.get(name).get(attribute);

    }

    public static void longestName(){
        for (String key:people.keySet()) {
            System.out.println(key + " " + key.length());
        }
    }


    //Web Automation with selenium
    //what is java object oriented programming
    //Java maps
    //Java collections
    //java BDD tools

}
