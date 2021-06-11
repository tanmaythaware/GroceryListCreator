package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
        System.out.println(item + " added.");
    }
    public void printGroceryList(){
        System.out.println("The grocery list contains: ");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void removeItem(String item){
        groceryList.remove(item);
        System.out.println(item + " removed.");
    }
    public void modifyItem(String olditem, String newItem){
        int index = groceryList.indexOf(olditem);
        groceryList.set(index,newItem);
        System.out.println(olditem + " replaced with " + newItem);
    }
    public void findItem(String item){
        if(groceryList.contains(item)){
            System.out.println(item + " is present in the grocery list");
        } else {
            System.out.println(item + " is not present in the grocery list");
        }
    }

}
