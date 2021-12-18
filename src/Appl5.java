import java.util.HashMap;
import java.util.Map;
import static java.lang.Math.*;

public class Appl5 {
    public static void main(String[] args) {
        Map<String, Integer> instruments = new HashMap<>();
        instruments.put("guitar",1200);
        instruments.put("cello",300);
        instruments.put("drum", 2000);
        instruments.put("cello",4500);
        System.out.println(instruments.size());
        System.out.println(instruments);


        Map<String, Integer> pantry = new HashMap<>();
        pantry.put("Apples",3);
        pantry.put("Oranges",2);
        int currentApples = pantry.get("Apples");
        pantry.put("Apples",currentApples+4);
        System.out.println(pantry.get("Apples"));

        System.out.println(PI);


    }
}
