package hewan;
public class Mamalia extends Hewan {
    @Override
    public void Hewan(){
        this.cbb="Melahirkan";
        this.gerak="Berjalan atau Melompat";
        this.makanan="Daging atau Tumbuhan";
        this.nafas="Paru-paru";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
}
