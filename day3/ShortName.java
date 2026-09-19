import java.util.Scanner;

public class ShortName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String name = input.nextLine();

        String[] words = name.trim().split("\\s+");

        if (words.length >= 2) {
            String shortName = "";

            for (int i = 0; i < words.length - 1; i++) {
                shortName += words[i].charAt(0) + ".";
            }

            shortName += words[words.length - 1];
            System.out.println("Short name: " + shortName);
        } else {
            System.out.println("Short name: " + name);
        }

        input.close();
    }
}
