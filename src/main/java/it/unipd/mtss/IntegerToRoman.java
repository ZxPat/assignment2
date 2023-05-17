////////////////////////////////////////////////////////////////////
// [Patrick] [Pavan] [2013448]
// [Matteo] [Maglie] [2034322]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

  private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

  public static String convert(int number) throws Exception{
    StringBuilder s = new StringBuilder();

    if(number < 1) throw new Exception("Il numero deve essere superiore o uguale a 1");
    if (number > 3000) throw new Exception("Il codice non assicura la corretta esecuzione con un numero superiore a 3000");

    for (int i = 0; i < values.length; i++) {
      while (number >= values[i]) {
        number -= values[i];
        s.append(romanLiterals[i]);
      }
    }
    

    return s.toString();
  }
}