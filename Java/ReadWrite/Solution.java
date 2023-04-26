package ReadWrite;

import java.io.*;
// Program to read and write into a file
import java.util.*;

/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a file name");
        // String filename = sc.nextLine();
        String filename = "newFile";
        File file = new File(filename);
        file.createNewFile();

        FileWriter input = new FileWriter(filename);
        char ch;
        do{
        System.out.println("Enter the string to be inserted");
        sc.nextLine();
        String fileWrite = sc.nextLine();
        input.write(fileWrite);
        input.write("\n");
        System.out.println("Do you want enter a new line?(y/n)");
        ch = sc.next().charAt(0);
        }while(ch!='n');

        input.close();
        FileReader reader = new FileReader(filename);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        int longest = 0;
        String longString = new String();
        while((line=bReader.readLine())!=null){
            String[] strLine = line.split(" ");
            for(int i=0;i<strLine.length;i++)
            {
                if(longest<strLine[i].length())
                {
                    longest = strLine[i].length();
                    longString = strLine[i];
                }
            }
            System.out.println(line);
            System.out.println("longest is :" + longString+" ("+longest+") ");
            longest = 0;
        }
        
        reader.close();
    }
    
}