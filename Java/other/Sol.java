import java.util.Scanner;

public class Sol {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();        
        boolean flag=false;
        // Complete the function
        char[] c = a.toCharArray();
        java.util.Arrays.sort(c);
        char[] d = b.toCharArray();
        java.util.Arrays.sort(d);
        String e = new String (c);
      String f = new String (d);
      if (e.equals(f)) {
          flag=true;
      }
      return flag;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
