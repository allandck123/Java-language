package hewan;
public class PausPembunuh extends Paus{
    @Override
    public void Hewan(){
        this.cbb="Melahirkan";
        this.gerak="Berenang";
        this.makanan="Daging";
        this.nafas="Paru-paru";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
    
}