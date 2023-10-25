import java.util.ArrayList;
import java.util.List;

public class Masodik {

    private Masodik(){
        
    }

    public static String Duplazo(String szo){
        StringBuilder sb = new StringBuilder();
        List<Character> maganhangzok = new ArrayList<>(List.of('a', 'A', 'e', 'E', 'o', 'O', 'i', 'I'));

        for(char c: szo.toCharArray()){
            if (maganhangzok.contains(c)){
                sb.append(c);
                sb.append(c);
            }
            else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
