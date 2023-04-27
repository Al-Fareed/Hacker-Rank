package Cart;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Cart> cartList = new ArrayList<Cart>(Arrays.asList(
            new Cart("Leather wallet", 1100, 18, 1),
            new Cart("Leather Jacket", 2000, 10, 2),
            new Cart("Leather Belt", 400, 8, 5)
        ));
        System.out.printf("%-20s %-10s %-10s %-10s\n","Name","Price","GST","Qty");
        for (Cart cart : cartList) {
            System.out.printf("%-20s %-10s %-10s %-10s\n",cart.ProductName(),cart.Price(),cart.tax(),cart.Qty());
        }
       new Calculate().calculate(cartList);
    }
}
