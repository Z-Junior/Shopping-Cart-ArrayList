import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
//declare and instantiate a variable cart to be an empty ArrayList
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        String keepShopping = "y";
        Scanner scan = new Scanner(System.in);
        while (keepShopping.equals("y"))
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            // *** print the contents of the cart object using println
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
    }
}
