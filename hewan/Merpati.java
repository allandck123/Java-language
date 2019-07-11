package hewan;
public class Merpati extends Aves{
    @Override
    public void Hewan(){
        this.cbb="Bertelur";
        this.gerak="Terbang";
        this.makanan="Tumbuhan";
        this.nafas="Pundi-pundi udara";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }
}
