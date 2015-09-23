I used scanner inFile to read from a file called "stocks.txt"

I declared the first string in the file as "firstTicker" and the corresponding price as "firstTickerPrice".
I did the same thing for the next set, naming them "secondTicker" and "secondTickerPrice", respectively.

The system outputs the first set of menu options to the user with the three options in the assignment.

I asked the user to input a choice, which would then be declared as int "choice".

"choice" becomes the switch for the four possible cases:

  case 1: The program asks the user to input a ticker name (which isn't case sensitive, using "equalsIgnoreCase").
          The program will then save the user's input as "ticker" and see if "ticker" matches either "firstTicker"
          "secondTicker". If "ticker" doesn't match either of the two, the program will exit.
          
  case 2: The program asks the user to input a price, which will be saved as double "priceInput". It will then run 
          three if statements; the first two will test to see if "priceInput" is lower than "firstTickerPrice"
          and "secondTickerPrice", and print out the name of the ticker(s) with prices greater than "priceInput".
          The last if statement uses "&&" to test if neither "firstTickerPrice" or "secondTickerPrice" are greater
          than "priceInput". If this is true, then the program will tell the user that it didn't find any tickers.
          
  case 3: The program will exit.
  
  default case: If the user enters an int other than 1, 2, or 3, then the program will tell the user that 
                an "unrecognized menu option" has been chose, and then exit.
                
 ***One thing that I would change about the program is to find a way around having three "if" statements in case 2.
 I think that it's possible to use an "else if" statement rather than use an "if" statement with the "&&" operator.
