package exceptionhandle;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        try{
            Scanner x = new Scanner (System.in);
            double p,l,luas;
            System.out.println("Masukan Panjang  : ");
            p = parseInt(x.next());
            System.out.println("Masukan Lebar : ");
            l = parseInt(x.next());
            
            luas = p * l;
            
            System.out.println("Luas : " + luas);
            
        }
        catch(NumberFormatException e){
            System.out.println("Masukan Angka yang benar!");
        }
    }
}       

