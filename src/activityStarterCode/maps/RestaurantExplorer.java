package activityStarterCode.maps;

import java.util.Map;
import java.util.HashMap;


public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<Integer, String> restaurantMap = new HashMap<>();


        // Step 2. Add five restaurants to the map (hint: use put()).

        restaurantMap.put("Chipotle", new Restaurant("Chipotle", "Mexican", 2));
        restaurantMap.put("Shish", new Restaurant("Shish", "Mediterranean", 4));
        restaurantMap.put("Caffe Latte", new Restaurant("Cafe Latte", "American", 5));
        restaurantMap.put("Breadsmith", new Restaurant("Breadsmith", "Bakery", 3));
        restaurantMap.put("Holy Land", new Restaurant("Holy Land", "Mediterranean", 4));







        // Step 3. Print the names of each restaurant (hint: use keySet()).

        System.out.println(restaurantMap.keySet());

        /*// Print the hash codes to figure out how the order of display is determined
        for(String rName : restaurantMap.keySet()) {
            System.out.println(rName.hashCode() + " : " + rName);
        }*/

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        if (restaurantMap.containsKey("Holy Land"))
            restaurantMap.remove("Holy Land");
        System.out.println(restaurantMap.keySet());

        // Step 5. Print the restaurant objects (hint: use values())

        System.out.println(restaurantMap.values());

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).

        System.out.println(restaurantMap.entrySet());
    }
}
