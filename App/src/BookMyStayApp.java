import java.util.HashMap;

public class BookMyStayApp {
    static void main() {
        String[] roomTypes = {"Single Room", "Double Room", "Deluxe Room"};
        int[] availability = {5, 3, 2};
        HashMap<String, Integer> roomInventory = new HashMap<>();
        roomInventory.put("Single Room", 5);
        roomInventory.put("Double Room", 3);
        roomInventory.put("Deluxe Room", 2);

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Available Room Types:\n");

        for (int i = 0; i < roomTypes.length; i++) {
            System.out.println(roomTypes[i] + " - Available: " + availability[i]);
        }

        System.out.println("\nSystem initialized successfully.");
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("Room Inventory:\n");
        for (String roomType : roomInventory.keySet()) {
            System.out.println(roomType + " - Available: " + roomInventory.get(roomType));
        }
    }


}
