package exceptionhandle;
public class Array {

public static void main(String[] args) {
        try{
           String[] siswa = new String[3];
           siswa[0] = "Raul";
           siswa[1] = "Hendy";
           siswa[2] = "Alland";
           System.out.println(siswa[4]);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array Tidak Terdaftar");
        }
        finally{
            System.out.println("\nFinally Disini Pasti Dieksekusi Maupun Program Itu Error");
        }  
}
}
