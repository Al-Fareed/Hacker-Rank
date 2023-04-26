package Collections;

// Program to demonstrate on ArrayList
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>(Arrays.asList("Hello", "World", "Al-Fareed", "Java Program"));
        for (String string : strings) {
            System.out.println(string);
        }
        strings.remove(1);
        for (String string : strings) {
            System.out.println(string);
        }
        // Searching element
        System.out.println("Enter element to be searched");
        String eleSearch = sc.nextLine();
        int i = 0;
        for (String string : strings) {
            i++;
            if (string.equals(eleSearch)) {
                System.out.println(string + "found index" + i);
            }else{
                System.out.println("Not found!");
            }
        }
        Collections.sort(strings);
        System.out.println("After sorting");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
