package ref;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapSet {

    public static void main(String[] args) {

        List<String> namelist = new LinkedList<>(); // Similar to ArrayList()
        namelist.add("Alvin");
        namelist.add("Chipmunck");
        namelist.add("Pikachu");
        namelist.add("Alvin");
        System.out.println(namelist.size());// Check size of the List
        System.out.println(namelist);// This is repeatable and ordered
        System.out.println(namelist.get(1)); // Use get to retrieve a single value
        namelist.remove(2); // Remove item at index 2
        System.out.println(namelist);
        namelist.set(0, "James"); // Replace item at index 0
        System.out.println(namelist);
        System.out.println(namelist.contains("Pikachu")); // Check if Array contains Pikachu
        namelist.clear(); // clear the List
        System.out.println(namelist);

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");
        System.out.println(fruits);// This is not-repeatable and unordered
        fruits.remove("Apple"); // remove by refer to object name
        System.out.println(fruits);// This is not-repeatable and ordered
        for (String i : fruits) { // looping of set using for each
            System.out.println(i);
        }
        // Other methods are similar to LinkedList

        Map<String, Integer> debt = new HashMap<>();
        debt.put("Lee", 100); // use put to add data to HashMap
        debt.put("Tan", 120);
        debt.put("Ali", 100);
        debt.put("Tan", 220); // Tan is already in the data, new value will be replaced
        System.out.println(debt); // This is not-repeatable and unordered
        System.out.println(debt.get("Tan")); // Use get to get the value of a key
        debt.remove("Lee"); // Use remove to remove a data]
        System.out.println(debt);
        for (String i : debt.keySet()) { // looping using keyset
            System.out.println("key: " + i + " value: " + debt.get(i));
        }

    }

}
