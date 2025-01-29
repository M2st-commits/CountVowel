import java.util.Scanner;

public class CountVowels {
    public static int countVowels(String str, int index) {
        if (index == str.length()) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        
        int count = 0;
        if ("aeiou".indexOf(ch) != -1) {
            count = 1;
        }

        return count + countVowels(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println("Number of vowels: " + countVowels(input, 0));
    }
}
