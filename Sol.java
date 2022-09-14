import java.io.*;
import java.util.*;

public class Sol {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String val="No";
        A = A.charAt(0).toUpperCase() + str.slice(1);
        B = B.charAt(0).toUpperCase() + str.slice(1);
        
        /* Enter your code here. Print output to STDOUT. */
        
        int lena=A.length();
        int lenb=B.length();
        
        int totLen = lena + lenb;
        
        System.out.println(totLen);
        int z = A.compareTo(B);
        if(z==0)
             val="Yes";
        else
            val="No";
        System.out.println(val);
        System.out.println(A +" "+ B);
    }
}



