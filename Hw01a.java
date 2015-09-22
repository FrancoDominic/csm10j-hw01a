/*
Programmer: Franco Lavares
Title:      Homework 1A
Date:       September 22, 2015
Filename:   Hw01a.java
 */

//package hw01a;

import java.util.Scanner;
import java.io.*;

public class Hw01a 
{

    public static void main(String[] args) throws FileNotFoundException
    {
        int choice;
        
        double firstTickerPrice, secondTickerPrice;
        
        String firstTicker, secondTicker;
        
        Scanner input = new Scanner(System.in);
        
        Scanner inFile = new Scanner(new File("stocks.txt"));
        
        firstTicker = inFile.next();
        firstTickerPrice = inFile.nextDouble();
        secondTicker = inFile.next();
        secondTickerPrice = inFile.nextDouble();
        
        System.out.println ("Enter '1' to get price by stock ticker.");
        
        System.out.println ("Enter '2' to get stocks greater than or equal to"
                + " specified price.");
        
        System.out.println ("Enter '3' to quit.");
        
        System.out.print ("Your choice: ");
        
        choice = input.nextInt();
        
        System.out.print ("\n");
        /*
        System.out.println("TEST");
        System.out.println(firstTicker);
        System.out.println(secondTicker);
        System.out.println(firstTickerPrice);
        System.out.println(secondTickerPrice);
        */
                
                
        switch (choice)
        {
            case 1:
            {
                System.out.print ("Enter a stock ticker: ");
                
                String ticker = input.next();
                
                System.out.print ("\n");
                
                if (ticker.equalsIgnoreCase(firstTicker))
                {
                    System.out.printf ("The current price of " + firstTicker
                    + " is: $" + "%.2f%n",firstTickerPrice);
                }
                else if (ticker.equalsIgnoreCase(secondTicker))
                {
                    System.out.printf ("The current price of " + secondTicker
                    + " is: $" + "%.2f%n",secondTickerPrice);
                }
                else 
                    System.out.println ("The ticker you entered was not found.");
               break;
            }    
            
            case 2:
            {
                
                System.out.print ("Enter a price: $");
                
                double priceInput = input.nextDouble();
                
                System.out.print ("\n");
                
                
                if (priceInput <= firstTickerPrice)
                {
                    System.out.printf ("The price of " + firstTicker
                    + " is greater than $" + "%.2f%n",priceInput);
                }
               
                if (priceInput <= secondTickerPrice)
                {
                    System.out.printf ("The price of " + secondTicker
                    + " is greater than $" + "%.2f%n",priceInput);
                }
                
                if (priceInput > firstTickerPrice && priceInput > secondTickerPrice)
                {
                    System.out.printf ("There are no tickers with a price"
                            + " greater than $" + "%.2f%n",priceInput);
                }
                break;
            }    
                
            case 3:
            {
                System.out.println ("Goodbye!");
                break;
            }
            
            default:
            {
                System.out.println ("Unrecognized menu option, exiting.");
            }    
                      
        }
                
    }    
        
}
            
            
        
    
    

