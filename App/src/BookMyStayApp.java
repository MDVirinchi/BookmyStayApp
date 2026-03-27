import java.util.HashMap;
import java.util.Scanner;

public class BookMyStayApp {
    static void main() {
            HashMap<String, Integer> roomInventory = new HashMap<>();
            roomInventory.put("Single Room", 5);
            roomInventory.put("Double Room", 3);
            roomInventory.put("Deluxe Room", 2);
            public static void main() {
                HashMap<String, Integer> roomInventory = new HashMap<>();
                roomInventory.put("Single Room", 5);
                roomInventory.put("Double Room", 3);
                roomInventory.put("Deluxe Room", 2);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to the Hotel Booking Management System");
                System.out.print("Enter room type to search: ");
                String searchRoom = scanner.nextLine();
                if (roomInventory.containsKey(searchRoom)) {
                    int available = roomInventory.get(searchRoom);

                    System.out.println("Welcome to the Hotel Booking Management System");
                    System.out.println("Room Inventory:\n");
                    for (String roomType : roomInventory.keySet()) {
                        System.out.println(roomType + " - Available: " + roomInventory.get(roomType));
                        if (available > 0) {
                            System.out.println(searchRoom + " is available. Rooms left: " + available);
                        } else {
                            System.out.println(searchRoom + " is currently not available.");
                        }

                        System.out.println("\nSystem initialized successfully.");
                    } else{
                        System.out.println("Invalid room type.");
                    }

                    scanner.close();
                }