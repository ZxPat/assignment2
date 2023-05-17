////////////////////////////////////////////////////////////////////
// [Patrick] [Pavan] [2013448]
// [Matteo] [Maglie] [2034322]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class RomanPrinter {

  public static String print(int num) throws Exception{
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) throws Exception{

    String[] asciiArtLines = new String[]{
        "",
        "",
        "",
        "",
        "",
        ""
    };


    String result="";
    
    for(int lettera=0; lettera < romanNumber.length();lettera++){
        for(int line=0; line < 6; line++){
            asciiArtLines[line]+=(getLetter(romanNumber.charAt(lettera))[line]);
        }
    }

    for(int line=0; line<6; line++){
        result+=asciiArtLines[line] +"\n";
    }
    
    return result;
  }

  private static String[] getLetter(char letter){
    
    HashMap<Character, String[]> map=new HashMap<Character, String[]>();

    map.put(
        'I',
        new String[] {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        }
    );

    map.put(
        'V',
        new String[]{
            "__      __ ",
            "\\ \\    / / ",
            " \\ \\  / /  ",
            "  \\ \\/ /   " ,
            "   \\  /    ",
            "    \\/     "
        }
    );

    map.put(
        'X',
        new String[]{
            "__   __ ",
            "\\ \\ / / ",
            " \\ V /  ",
            "  > <   ",
            " / . \\  ",
            "/_/ \\_\\ "
        }
    );

    map.put(
        'L',
        new String[]{
            " _      ",      
            "| |     ",     
            "| |     ",     
            "| |     ",     
            "| |____ ",
            "|______|"
        }
    );

    map.put(
        'C',
        new String[]{
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        }
    );

    map.put(
        'D',
        new String[]{
            " _____  ", 
            "|  __ \\ ", 
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        }
    );

    map.put(
        'M',
        new String[]{
            " __  __ ", 
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        }
    );

    return map.get(letter);
    
  }
}
