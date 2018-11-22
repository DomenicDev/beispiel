package de.cassisi;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * This is the main
     * @param args the submitted arguments
     */
    public static void main( String[] args )
    {
	Scanner scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	s = s.toUpperCase();
        System.out.println( s );
    }
}
