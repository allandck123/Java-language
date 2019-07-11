package uts_hewan;
//Alland Chandra Kesuma (20170801011)
import java.util.Scanner;
public class UTS_Hewan {
    String nama;
    String makanan;
    String minuman;
    int minum;
    int tidur;
    String mainan;
    int cnt;
    public void lakuan(){
        Scanner ins = new Scanner(System.in);
        System.out.print("Nama Hewan                        : ");
        nama = ins.nextLine();
        System.out.print("Makanan (Daging/Sayur/Sampah)     : ");
        makanan = ins.nextLine();
        System.out.print("Minuman (Susu/Air/Air Selokan)    : ");
        minuman = ins.nextLine();
        System.out.print("Jumlah Air Minum (0-150 ml)       : ");
        minum = ins.nextInt();
        System.out.print("Lama Tidur (0-16 Jam)             : ");
        tidur = ins.nextInt();
        System.out.print("Mainan Hewan (Istana/Bola/Sampah) : ");
        mainan = ins.next();
    }
    public void active(){
        System.out.println(" ");
        System.out.println("Kegiatan "+nama+ " :");
        System.out.println(nama+" Memakan "+makanan);
        System.out.println(nama+" Meminum "+minuman+" Sebanyak "+minum+" ml");
        System.out.println(nama+" Tidur Selama "+tidur+" jam");
        System.out.println(nama+" Bermain "+mainan);
    }
    public void cond(){
        System.out.println(" ");
        System.out.println("Kondisi "+nama+" : ");
        if("Daging".equals(makanan) || "daging".equals(makanan))
        {
            cnt+=2;
            System.out.println("Makan   = Kenyang");
        }else if("Sayur".equals(makanan) || "sayur".equals(makanan))
            {
                cnt+=1;
                System.out.println("Makan   = Cukup");
            }else if("Sampah".equals(makanan) || "sampah".equals(makanan))
                {
                    cnt+=0;
                    System.out.println("Makan   = Lapar");
                }
        if("Susu".equals(minuman) || "susu".equals(minuman))
        {
            cnt+=2;
            System.out.println("Minuman = Suka");
        }else if("Air".equals(minuman) || "air".equals(minuman))
            {
                cnt+=1;
                System.out.println("Minuman = Biasa");
            }else if("Air Selokan".equals(minuman) || "Air selokan".equals(minuman) || "air selokan".equals(minuman))
                {
                    cnt+=0;
                    System.out.println("Minuman = Benci");
                }
        if(minum >= 75 && minum <=1000 )
        {
            System.out.println("Minum   = Puas");
            cnt+=2;
        }else if(minum >= 30 && minum < 75)
            {
                System.out.println("Minum   = Cukup");
                cnt+=1;
            }else if(minum < 30)
                {
                    System.out.println("Minum   = Haus");
                    cnt+=0;
                }else if(minum > 1000)
                {
                    System.out.println("Minum   = Berlebihan");
                    cnt-=1;
                }
        if(tidur >= 12 && tidur <24 )
        {
            System.out.println("Tidur   = Puas");
            cnt+=2;
        }else if(tidur >= 6 && tidur < 12)
        {
            System.out.println("Tidur   = Cukup");
            cnt+=1;
        }else if(tidur < 6)
            {
                System.out.println("Tidur   = Kurang");
                cnt+=0;
            }else if(tidur >= 24)
                {
                    System.out.println("Tidur   = Berlebihan");
                    cnt-=1;
                }
        if("Istana".equals(mainan) || "istana".equals(mainan))
        {
            cnt+=2;
            System.out.println("Bermain = Senang");
        }else if("Bola".equals(mainan) || "bola".equals(mainan))
            {
                cnt+=1;
                System.out.println("Bermain = Cukup");
            }else if("Sampah".equals(mainan) || "sampah".equals(mainan))
                {
                    cnt+=0;
                    System.out.println("Bermain = Bosan");
                }
        System.out.println(" ");
        System.out.println("Kondisi Keseluruhan : ");
        if(cnt>=7)
        {
            System.out.println("Puas");
        }else if(cnt>=5 && cnt<7)
            {
                System.out.println("Tercukupi");
            }else if(cnt>=2 && cnt<5)
                {
                    System.out.println("Pas-pasan");
                }else if(cnt<2 && cnt>0)
                    {
                        System.out.println("Hampir Mati");
                    }else if(cnt<=0)
                        {
                            System.out.println("Mati");
                        }
        
    }
    public static void main(String[] args) {
        UTS_Hewan kucing = new UTS_Hewan();
        kucing.lakuan();
        kucing.active();
        kucing.cond();
        
    }
    
}
