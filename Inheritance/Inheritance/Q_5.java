/*
Write a program to check the font class method as follows: Create a font TimesRoman bold and Italic size 12.
Use the font methods to display the attributes of the font.
*/

import java.awt.*;
class FontChecking
{
    public static void main (String arg [ ])
    {
        Font f;
        f = new Font ("TimesNewRoman", Font.BOLD+Font.ITALIC,12);
        String font = f. getName( );
        int style = f.getStyle ( );
        int size = f.getSize ( );
        boolean bold = f.isBold ( );
        boolean normal = f.isPlain ( );
        boolean italic = f.isItalic ( );
        System.out.println ("Font : "+ font + "\n Style : "+ style + "\n Size: "+ size + "\n Bold : "+bold + "\n Italic : "+italic);
    }
}