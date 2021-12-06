package shoppingcart;

import java.io.Console;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to your shopping cart");
        Console cons = System.console();
        String contents = cons.readLine("Please input an item: ");
        String newcontent = contents.trim().toLowerCase();
        
        
        ArrayList<String> cart = new ArrayList<String>();
        cart.add("apple");
        cart.add("orange");
        cart.add("pear");
        cart.add("grape");
        System.out.println("Your contents in the cart are as follows:");
        System.out.println(cart);
    }
}
