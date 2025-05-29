package com.tns.Restaurant;

import java.util.ArrayList;
import java.util.List;
import com.tns.fooditem.FoodItem;

public class Restaurant implements  RestaurantOperations {
private int id;
private String name;
private List<FoodItem>menu;
public Restaurant(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	this.menu=new ArrayList<>();
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}
@Override
public String toString() {
    return "Restaurant [id=" + id + ", name=" + name + ", menu=" + menu + "]";
}
public List<FoodItem> getMenu() {
	return menu;
}
public void addFoodItem(FoodItem foodItem) {
    menu.add(foodItem);
}
public void removeFoodItem(int Id) {
	menu.removeIf(item -> item.getId() == Id);}
}


