import java.util.HashMap;
import java.util.Map;

public class Occurence {
    public static void main(String[] args) {
        String string = "shahil";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:string.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
