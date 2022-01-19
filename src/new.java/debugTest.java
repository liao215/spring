import java.util.HashMap;

public class debugTest {
    private static Object Key;

    public static void main(String[] args) {
    
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Yom");
        map.put("age","12");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age=" + age );



    }
}
