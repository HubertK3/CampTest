import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczby do drzewa (wpisz 'q' aby zakończyć):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int value = Integer.parseInt(input);
                tree.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawna wartość, spróbuj ponownie.");
            }
        }

        System.out.println("Wprowadź pierwszą wartość do sprawdzenia:");
        int value1 = scanner.nextInt();
        System.out.println("Czy drzewo zawiera wartość " + value1 + "? " + tree.contains(value1));

        System.out.println("Wprowadź drugą wartość do sprawdzenia:");
        int value2 = scanner.nextInt();
        System.out.println("Czy drzewo zawiera wartość " + value2 + "? " + tree.contains(value2));

        try {
            System.out.println("Największa wartość w drzewie: " + tree.max());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Najmniejsza wartość w drzewie: " + tree.min());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}