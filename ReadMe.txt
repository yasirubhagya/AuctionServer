change static int portNo in StockApp class to change the Listening port;
make sure csv file is in the same folder which class files exists.
Use javac StockApp.java command to compile then use java StockApp to run the programme.

Bug :-  Programme throws exception some times(not always) when updating table.But it doesent affect the functionality of programme.
        
        When connected through nc or telenet at the begining programme ask to press enter before anything,
        This was done this way to avoid garbage values in input buffer.