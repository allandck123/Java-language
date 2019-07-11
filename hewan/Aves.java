package hewan;
public class Aves extends Hewan{
    @Override
    public void Hewan(){
        this.cbb="Bertelur";
        this.gerak="Terbang";
        this.makanan="Daging atau Tumbuhan";
        this.nafas="Pundi-pundi udara";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
}
