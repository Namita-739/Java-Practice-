import java.util.*;

class Geeks{
    public static void main(String[] args) {
        
        Set<Object> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add("GfG");
        set.add(true);

        System.out.println(set);
    }
}


//[20, GfG, 10, true]
