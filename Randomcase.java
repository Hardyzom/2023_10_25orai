import java.util.Scanner;

class PyUtils {
    public static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
}

class StringUtils {
    public static String randomCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            double random = Math.random();
            if (random < 0.5) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}

public class Randomcase {
    public static void main(String[] args) {
        System.out.print("Szoveg: ");
        String text = PyUtils.input();
        String randomCaseText = StringUtils.randomCase(text);
        System.out.println(randomCaseText);
    }
}