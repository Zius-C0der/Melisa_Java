package javaNotes;

public class TypeConversions20210926 {

    public static void main(String[] args) {
        System.out.println(strToInt("924")*2);
    }

    // convert String to int
    public static Integer strToInt(String number){
        return Integer.parseInt(number);
    }
}
