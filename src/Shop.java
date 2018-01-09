import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main(String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        String itemName;
        double itemPrice;
        int quantity;
        String keepShopping = "y";
        Scanner scan = new Scanner(System.in);

        while (keepShopping.equals("y"))
        {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            cart.add(new Item(itemName, itemPrice, quantity));

            System.out.println("==================== Your Cart ==================");
            System.out.println("Item    \t\tPrice\t   Quantity\t   Item Total");
            System.out.println("***************************************************");

            for (Item item : cart)
            {
                System.out.println(String.format("%s\t\t        $%.2f      %d\t\t   $%.2f", item.getName(), item.getPrice(), item.getQuantity(), item.getPrice() * item.getQuantity()));
            }



            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
    }
}
