////////////////////////////////////////////////////////////////////
// [Patrick] [Pavan] [2013448]
// [Matteo] [Maglie] [2034322]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IntegerToRomanTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void convertTest4() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(4);
        //Assert
        assertEquals("IV", result);

    }

    @Test
    public void convertTest5() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(5);
        //Assert
        assertEquals("V", result);
    }

    @Test
    public void convertTest9() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(9);
        //Assert
        assertEquals("IX", result);
    }

    @Test
    public void convertTest2() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(2);
        //Assert
        assertEquals("II", result);
    }

    @Test
    public void convertTest29() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(29);
        //Assert
        assertEquals("XXIX", result);
    }

    @Test
    public void convertTest199() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(199);
        //Assert
        assertEquals("CXCIX", result);
    }

    @Test
    public void convertTest1900() throws Exception{
        //Arrange
        String result="";
        //act
        result = IntegerToRoman.convert(1900);
        //Assert
        assertEquals("MCM", result);
    }

    @Test
    public void convertTestNegative() throws Exception{
        //Arrange
        String result="";
        exception.expect(Exception.class);
        exception.expectMessage("Il numero deve essere superiore o uguale a 1");
        //act
        result = IntegerToRoman.convert(-5);
    }

    @Test
    public void convertTestTooLarge() throws Exception{
        //Arrange
        String result="";
        exception.expect(Exception.class);
        exception.expectMessage("Il codice non assicura la corretta esecuzione con un numero superiore a 3000");
        //act
        result = IntegerToRoman.convert(3500);
        
    }
}