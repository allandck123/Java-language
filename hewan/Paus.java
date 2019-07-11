package hewan;
public class Paus extends Mamalia{
    @Override
    public void Hewan(){
        this.cbb="Melahirkan";
        this.gerak="Berenang";
        this.makanan="Daging dan Plankton";
        this.nafas="Paru-paru";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
    
}
