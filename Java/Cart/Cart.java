package Cart;

/**
 * Cart
 */
public class Cart {
    private String pName;
    private double uPrice;
    private double gst;
    private int qty;

    public Cart(String name, double price, double gst, int qty) {
        pName = name;
        uPrice = price;
        this.gst = gst;
        this.qty = qty;
    }
    public String ProductName(){return pName;}
    public double Price(){return uPrice;}
    public double tax(){return gst;}
    public int Qty(){return qty;}


}