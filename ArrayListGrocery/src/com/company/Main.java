package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        printMenu();
        int choice;
        String quit;
        boolean flag = true;
        while (flag){
            System.out.println("Enter choice:");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    searchItem();
                    break;
                case 5:
                    printList();
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    System.out.println("Exiting Application..");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice. Try again..");
            }
        }
    }
    public static void printMenu(){
        System.out.println("Menu to create a grocery list.");
        System.out.println("Press 1 to add item to the list.");
        System.out.println("Press 2 to remove item from the list.");
        System.out.println("Press 3 to modify item of the list.");
        System.out.println("Press 4 to search an item in the list.");
        System.out.println("Press 5 to print the list.");
        System.out.println("Press 6 to print menu.");
        System.out.println("Press 7 to quit.");
    }
    public static void addItem(){
        System.out.println("Enter the item:");
        String item = scan.nextLine();
        groceryList.addItem(item);
    }
    public static void removeItem(){
        System.out.println("Enter item to be removed:");
        String item = scan.nextLine();
        groceryList.removeItem(item);
    }
    public static void modifyItem(){
        System.out.println("Enter item to be replaced:");
        String oldItem = scan.nextLine();
        System.out.println("Enter new item");
        String newItem = scan.nextLine();
        groceryList.modifyItem(oldItem,newItem);
    }
    public static void searchItem(){
        System.out.println("Enter item to be searched:");
        String item = scan.nextLine();
        groceryList.findItem(item);
    }
    public static void printList(){
        groceryList.printGroceryList();
    }
}
