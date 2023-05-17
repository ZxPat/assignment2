////////////////////////////////////////////////////////////////////
// [Patrick] [Pavan] [2013448]
// [Matteo] [Maglie] [2034322]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;
import org.junit.rules.ExpectedException;

public class RomanPrinterTest{
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void printTest1() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result = "";
            theMock.when(()-> IntegerToRoman.convert(1))
                .thenReturn("I");
            //act
            result = RomanPrinter.print(1);
            //assert
            assertEquals(" _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n", result);
        }
    }

    @Test
    public void printTest5() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(5))
                .thenReturn("V");
            //act
            result = RomanPrinter.print(5);
            //assert
            assertEquals("__      __ \n\\ \\    / / \n \\ \\  / /  \n  \\ \\/ /   \n   \\  /    \n    \\/     \n",result);
        }
    }

    @Test
    public void printTest10() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(10))
                .thenReturn("X");
            //act
            result = RomanPrinter.print(10);
            //assert
            assertEquals("__   __ \n\\ \\ / / \n \\ V /  \n  > <   \n / . \\  \n/_/ \\_\\ \n",result);
        }
    }

    @Test
    public void printTest50() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(50))
                .thenReturn("L");
            //act
            result = RomanPrinter.print(50);
            //assert
            assertEquals(" _      \n| |     \n| |     \n| |     \n| |____ \n|______|\n",result);
        }
    }

    @Test
    public void printTest100() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(100))
                .thenReturn("C");
            //act
            result = RomanPrinter.print(100);
            //assert
            assertEquals("  _____ \n / ____|\n| |     \n| |     \n| |____ \n \\_____|\n",result);
        }
    }

    @Test
    public void printTest500() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(500))
                .thenReturn("D");
            //act
            result = RomanPrinter.print(500);
            //assert
            assertEquals(" _____  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/ \n",result);
        }
    }

    @Test
    public void printTest1000() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(1000))
                .thenReturn("M");
            //act
            result = RomanPrinter.print(1000);
            //assert
            assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n",result);
        }
    }

    @Test
    public void printTestNegative() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(Mockito.intThat(new LessThan<Integer>(1))))
                .thenThrow(new Exception("Il numero deve essere superiore o uguale a 1"));
            exception.expect(Exception.class);
            exception.expectMessage("Il numero deve essere superiore o uguale a 1");
            //act
            result = RomanPrinter.print(-5);
        }
    }

    @Test
    public void printTestTooLarge() throws Exception{
        try(MockedStatic<IntegerToRoman> theMock = Mockito.mockStatic(IntegerToRoman.class)){

            //Arrange
            String result="";
            theMock.when(()-> IntegerToRoman.convert(Mockito.intThat(new GreaterThan<Integer>(3000))))
                .thenThrow(new Exception("Il codice non assicura la corretta esecuzione con un numero superiore a 3000"));

            exception.expect(Exception.class);
            exception.expectMessage("Il codice non assicura la corretta esecuzione con un numero superiore a 3000");
            //act
            result = RomanPrinter.print(3500);

            
        }
    
    }
}
