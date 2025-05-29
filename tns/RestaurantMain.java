package com.tns.estaurant;
import java.util.*;

import com.tns.Restaurant.Restaurant;
//import com.tns.Restaurant.RestaurantOperations;
import com.tns.fooditem.FoodItem;

public class RestaurantMain {
	    private static List<Restaurant> restaurants = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("Restaurant Menu System");
	            System.out.println("1. Add Restaurant");
	            System.out.println("2. Add Food Item to Restaurant");
	            System.out.println("3. Remove Food Item from Restaurant");
	            System.out.println("4. View Menus");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
                case 1 -> addRestaurant();
                case 2 -> addFoodItemToRestaurant();
                case 3 -> removeFoodItemFromRestaurant();
                case 4 -> viewRestaurants();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }
		private static void addRestaurant() {
	        System.out.print("Enter restaurant id: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();  // consume newline
	        System.out.print("Enter restaurant name: ");
	        String name = scanner.nextLine();
	        Restaurant restaurant = new Restaurant(id, name); 
	        restaurants.add(restaurant);
	        System.out.println(" Restaurant added.");
	    }
 private static void addFoodItemToRestaurant() {
		     System.out.print("Enter restaurant id: ");
		        int Id = scanner.nextInt();
		        Restaurant restaurant = findRestaurantById(Id);

		        if (restaurant != null) {
		            System.out.print("Enter food item id: ");
		            int foodId = scanner.nextInt();
		            scanner.nextLine();
		            System.out.print("Enter food name: ");
		            String foodName = scanner.nextLine();
		            System.out.print("Enter food price: ");
		            double price = scanner.nextDouble();

		            restaurant.addFoodItem(new FoodItem(foodId, foodName, price));
		            System.out.println(" Food item added.");
		        } else {
		            System.out.println("Restaurant not found.");
		        }
		    }
private static void removeFoodItemFromRestaurant() {
    System.out.print("Enter restaurant id: ");
    int Id = scanner.nextInt();
    Restaurant restaurant =findRestaurantById(Id);

    if (restaurant != null) {
        System.out.print("Enter food item id to remove: ");
        int foodId = scanner.nextInt();
        restaurant.removeFoodItem(foodId);
        System.out.println(" Food item removed ");
    } else {
        System.out.println(" Restaurant not found.");
    }
}
private static void viewRestaurants() {
    if (restaurants.isEmpty()) {
        System.out.println(" No restaurants available.");
    } else {
        for (Restaurant r : restaurants) {
            System.out.println("\nRestaurant ID: " + r.getId());
            System.out.println("Name: " + r.getName());
            System.out.println("Menu:");
            for (FoodItem f : r.getMenu()) {
                System.out.println("  " + f);
            }
        }
        }
    }
private static Restaurant findRestaurantById(int id) {
    for (Restaurant r : restaurants) {
        if (r.getId() == id) {
            return r;
        }
}
    return null;
}
}