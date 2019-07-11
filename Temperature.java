package exceptionhandle;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
        try{
            Scanner x = new Scanner (System.in);
            int c,f,luas;
            System.out.println("Masukan suhu Fahrenheit  : ");
            f = parseInt(x.next());
            System.out.println("Masukan Suhu Celsius : ");
            c = parseInt(x.next());
            f = (9*c)/5+32;
            c = (f-32)*5/9;
            System.out.println("Suhu Celsius = "+c);
            System.out.println("Suhu Fahrenheit = "+f);
        }
        catch(NumberFormatException e){
            System.out.println("Masukan Angka yang benar!");
        }
    }
}
