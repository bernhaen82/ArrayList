import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMaker {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("A – Add an item to the list");
            System.out.println("D – Delete an item from the list");
            System.out.println("P – Print (display) the list");
            System.out.println("Q – Quit the program");
            System.out.print("Choose an option: ");
            String option = scanner.nextLine();
            switch (option.toUpperCase()) {
                case "A":
                    System.out.print("Enter an item to add: ");
                    String addItem = scanner.nextLine();
                    arrayList.add(addItem);
                    break;
                case "D":
                    System.out.print("Enter the number of the item to delete: ");
                    int numberToDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (numberToDelete >= 1 && numberToDelete <= arrayList.size()) {
                        arrayList.remove(numberToDelete - 1);
                        System.out.println("Item deleted.");
                    } else {
                        System.out.println("Invalid number. No item deleted.");
                    }
                    break;
                case "P":
                    System.out.println("Elements in the ArrayList:");
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println((i + 1) + ". " + arrayList.get(i));
                    }
                    break;
                case "Q":
                    System.out.println("Quitting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}