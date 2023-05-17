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
    public void convertTest() throws Exception{

        String result="";
        //act
        result = IntegerToRoman.convert(4);
        //Assert
        assertEquals("IV", result);

        //act
        result = IntegerToRoman.convert(5);
        //Assert
        assertEquals("V", result);

        //act
        result = IntegerToRoman.convert(9);
        //Assert
        assertEquals("IX", result);

        //act
        result = IntegerToRoman.convert(2);
        //Assert
        assertEquals("II", result);

        //act
        result = IntegerToRoman.convert(29);
        //Assert
        assertEquals("XXIX", result);

        //act
        result = IntegerToRoman.convert(199);
        //Assert
        assertEquals("CXCIX", result);

        //act
        result = IntegerToRoman.convert(1900);
        //Assert
        assertEquals("MCM", result);
        
        //prepare
        exception.expect(Exception.class);
        exception.expectMessage("Il numero deve essere superiore o uguale a 1");
        //act
        result = IntegerToRoman.convert(-5);
        
        //prepare
        exception.expect(Exception.class);
        exception.expectMessage("Il codice non assicura la corretta esecuzione con un numero superiore a 3000");
        //act
        result = IntegerToRoman.convert(3500);
        
        
    }
}