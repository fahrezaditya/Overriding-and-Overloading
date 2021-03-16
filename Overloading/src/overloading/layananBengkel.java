
package overloading;

public class layananBengkel{
    
    String sparepart[] = {"","Oli mesin   ","Busi\t  ","Air radiator"};
    int harga1[] = {1, 128000, 85000, 230000};
    int harga2[] = {1, 74000, 43000, 87000};
    
    public void layananBengkel (String unit, String jenis, int harga){
        
        System.out.println("=> Servis "+unit+" "+jenis+"\n   Biaya : Rp "+harga+".00\n");
    }
    
    public void layananBengkel (String unit, String jenis, float harga){
        
        System.out.println("=> Ganti sparepart "+unit+" "+jenis+"\n   Biaya jasa Rp : "+harga+"0\n");
    }
    
    public void sparepartMobil(){
        System.out.println("   Sparepart :");
        for (int i =1 ; i <=3; i++){
            System.out.println("   "+i+". "+sparepart[i]+" : Rp "+harga1[i]); }
        System.out.println("   4. dll.\n");
    }
    
    public void sparepartMotor(){
        System.out.println("   Sparepart :");
        for (int i =1 ; i <=3; i++){
            System.out.println("   "+i+". "+sparepart[i]+" : Rp "+harga1[i]+".00"); }
        System.out.println("   4. dll.\n");
    }
}

