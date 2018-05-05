import java.util.*;
import java.io.*;
 

/**
 * Write a description of class helloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class helloWorld
{
    public static void main(String[] args)throws IOException 
    {
       String content = new Scanner(new File("black.txt")).useDelimiter("\\Z").next();
       System.out.println(content.length());
       
    }
    
}
