package hewan;
public class Kucing extends Mamalia{
    @Override
    public void Hewan(){
        this.cbb="Melahirkan";
        this.gerak="Berjalan";
        this.makanan="Daging dan Tumbuhan";
        this.nafas="Paru-paru";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
    
}
