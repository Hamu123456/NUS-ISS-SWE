package Workshops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class workshop1 { 
    public static void main(String[] args) {
        //System.out.println("Welcome to your shopping cart");
        Scanner scanner = new Scanner(System.in); //creating a scanner to accept user input
		System.out.println("Test");
		System.out.println("Welcome to your shopping cart, please input list.");
		String inputList = scanner.nextLine(); //assigning the user input into a string variable
		//boolean exit = false;

        //while (exit = false) {

        while (!inputList.equals("list")) {
            System.out.println("Please input 'list'");
            inputList = scanner.nextLine();  //no need to declare variable again if you want to reuse it
        }

        System.out.println("Hello, your " + inputList + " is empty. Please add 3 fruits.");
        
        ArrayList<String> fruitList = new ArrayList<String>();
        String fruit1 = scanner.nextLine();
        String fruit2 = scanner.nextLine();
        String fruit3 = scanner.nextLine();
		
		fruitList.add(fruit1);
		fruitList.add(fruit2);
		fruitList.add(fruit3);

        System.out.println("Your list of fruits is as follows:");

        for (int i=0; i<fruitList.size(); i++) {
            //System.out.println("Your fruits are: ");
			System.out.println((i+1) +") " + (fruitList.get(i)));
		}

        System.out.println("You can remove any items if you want, type: delete item no.");
        int itemNum = scanner.nextInt();
        fruitList.remove(itemNum-1);

        System.out.println("Your new list of fruits is as follows:");

        for (int i=0; i<fruitList.size(); i++) {
            //System.out.println("Your fruits are: ");
			System.out.println((i+1) +") " + (fruitList.get(i)));
        }

        

        
    }
    
}
