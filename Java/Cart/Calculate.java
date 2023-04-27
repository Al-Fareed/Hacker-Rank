package Cart;
import java.util.*;
public class Calculate extends Cart {
public Calculate() {
    super("",0,0,0);
}

    double total=0;
    public void calculate(List<Cart> cartList){
        for (Cart cart : cartList) {
            total =total+ cart.Qty()*cart.Price();
        }
        System.out.println("Total is "+total);
    }
}
