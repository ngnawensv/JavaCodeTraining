import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl7 {
    public static void main(String[] args) {
        long begin =System.currentTimeMillis();
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));


        List<Boolean> l = new ArrayList<>();
        l.add(true);
        l.add(Boolean.parseBoolean("False"));
        l.add(Boolean.TRUE);
        System.out.println(l.size());
        System.out.println(l.get(1));
        System.out.println(l.get(1) instanceof Boolean);

        long end =System.currentTimeMillis();
        System.out.println("Duration : "+(end-begin)+"ms");

    }
}
