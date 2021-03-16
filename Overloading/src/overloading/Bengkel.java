
package overloading;

public class Bengkel {
    
    public void mobil (){
        System.out.println("======= Bengkel Mobil =======\n=============================\n");
        
        layananBengkel data = new layananBengkel (); 
        data.layananBengkel("mobil", "metic", 650000);
        data.layananBengkel("mobil", "manual", 500000);
        data.layananBengkel("mobil", "sport", 850000);
        data.sparepartMobil();
        data.layananBengkel("mobil", "matic", 200000f);
        data.layananBengkel("mobil", "manual", 150000f);
        data.layananBengkel("mobil", "sport", 1500000f);
    }
    
    public void motor (){
        System.out.println("\n======= Bengkel Motor =======\n=============================\n");
        
        layananBengkel data = new layananBengkel ();
        data.layananBengkel("motor", "matic", 75000);
        data.layananBengkel("motor", "manual", 70000);
        data.layananBengkel("motor", "sport", 180000);
        data.sparepartMotor();
        data.layananBengkel("motor", "matic", 25000f);
        data.layananBengkel("motor", "manual", 25000f);
        data.layananBengkel("motor", "sport", 35000f);
    }
}
