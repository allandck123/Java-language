package hewan;
public class Hewan {
    String cbb,makanan,gerak,nafas;
    public void Hewan(){
        this.cbb="Melahirkan atau Bertelur";
        this.gerak="Berjalan, Berenang, Merayap, atau Melata";
        this.makanan="Daging atau Tumbuhan, atau Semua";
        this.nafas="Paru-paru atau Pundi-pundi udara";
        
        System.out.println(getClass().getSimpleName()+" berkembang biak dengan cara "+cbb );
        System.out.println(getClass().getSimpleName()+" bergerak dengan cara "+gerak );
        System.out.println(getClass().getSimpleName()+" memakan "+makanan );
        System.out.println(getClass().getSimpleName()+" bernafas dengan "+nafas );
    }

}