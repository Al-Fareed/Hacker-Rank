import java.util.*;
/**
 program to calculate denominations to be given to user
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the amount required");
        int amount = 479;
        int tmpAmount = amount;
        int denominations[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int count[] = new int[denominations.length];
        System.out.println("---------------------------");
        int totAmount = 0;
        int len = denominations.length;
        for (int i = 0; i < len; i++) {
            while (denominations[i] <= tmpAmount) {
                tmpAmount -= denominations[i];
                totAmount += denominations[i];
                count[i]++;
            }
            if (totAmount == amount) {
                break;
            }
        }
        System.out.printf("%-6s %-3s %-6s","Rupees","Denominations","Amount\n---------------------------\n");
        for (int i=0; i<len;i++) {
            if(count[i]>0)
            {
                System.out.printf("%-6s %-13s %-6s\n",denominations[i],count[i],count[i]*denominations[i]);
            }
        }
        System.out.println("---------------------------");
        System.out.printf("%-20s %-4s","Total :",amount);
        System.out.println("\n---------------------------");
    }
}