package bilangan;
import java.util.Scanner;
public class Bilangan {
    public void menu(){
        Scanner input=new Scanner(System.in);
        Bilangan Ang=new Bilangan();
        int pil,juml,n;
        
        System.out.println("Repetation");
        System.out.println("1. Menampilkan Bilangan Genap");
        System.out.println("2. Menampilkan Bilangan Prima");
        System.out.println("3. Menampilkan Bilangan Ganjil");
        System.out.println("4. Menampilkan Bilangan Fibonacci");
        System.out.println("5. Menampilkan Bilangan Bulat Positif");
        System.out.println("Pilihan anda : ");
        pil=input.nextInt();
        System.out.println("Masukkan batas bilangan");
        juml=input.nextInt();
        if(pil==1)
        {Ang.genap(juml);}
        else if(pil==2)
            {Ang.prima(juml);}
        else if(pil==3)
            {Ang.ganjil(juml);}
        else if(pil==4)
            {Ang.fibo(juml);}
        else if(pil==5)
            {Ang.bulat(juml);}
    }
    public void genap(int juml){
        int n=0;
        do{
           if(n%2==0){
               System.out.print(n+" ");}
           n++;
        }while(n<=juml);
    }
    public void prima(int juml){
       int x,y,counter;
       x=1;
       do{
           y=1;
           counter=0;
           do{
               if(x%y==0){
                   counter++;
               }
               y++;
           }while(y<=x);
           if(counter==2){
               System.out.print(x+" ");
           }
           x++;
       }while(x<=juml);
	
    }
    public void ganjil(int juml){
        int n=0;
        do{
           if(n%2==1){
               System.out.print(n+" ");}
           n++;
        }while(n<=juml);
    }
    public void fibo(int juml){
        int x,y,z,cnt;
        x=0;
        y=1;
        cnt=0;
        do{
            z=x;
            x=x+y;
            y=z;
            System.out.print(z+" ");
            cnt++;
        }while(cnt<juml);
    }
    public void bulat(int juml){
        int n;
        n=0;
        do{
            System.out.print(n+" ");
            n++;
        }while(n<=juml);
    }
    
    public static void main(String[] args) {
        Bilangan b= new Bilangan();
        b.menu();
    }
}
