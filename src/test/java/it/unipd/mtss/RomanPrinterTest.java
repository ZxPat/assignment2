////////////////////////////////////////////////////////////////////
// [Patrick] [Pavan] [2013448]
// [Matteo] [Maglie] [2034322]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest{
    @Test
    public void printTest() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){
            theMock.when(()-> IntegerToRoman.convert(anyInt()))
                .thenReturn(anyString( ));
        }

        
        
        //prepare
        String result = "";
        //act
        result = RomanPrinter.print(1);
        //assert
        assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n",result);
        
        //act
        result = RomanPrinter.print(5);
        //assert
        assertEquals("__      __ \n\\ \\    / / \n \\ \\  / /  \n  \\ \\/ /   \n   \\  /    \n    \\/     \n",result);
        
        //act
        result = RomanPrinter.print(10);
        //assert
        assertEquals("__   __ \n\\ \\ / / \n \\ V /  \n  > <   \n / . \\  \n/_/ \\_\\ \n",result);

        //act
        result = RomanPrinter.print(50);
        //assert
        assertEquals(" _      \n| |     \n| |     \n| |     \n| |____ \n|______|\n",result);

        //act
        result = RomanPrinter.print(100);
        //assert
        assertEquals("  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|\n",result);

        //act
        result = RomanPrinter.print(500);
        //assert
        assertEquals(" _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ \n",result);

        //act
        result = RomanPrinter.print(1000);
        //assert
        assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n",result);
        
        
    
        
    
    }
}
