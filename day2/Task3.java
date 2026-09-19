import java.util.*;

class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[5];
        int i;

        System.out.print("Enter the five names : ");
        for (i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted names in ascending order : ");
        for (i = 0; i < 5; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
