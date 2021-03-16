
package overriding;

public class Main {

    // Method main
    public static void main(String[] args) { 
        
        // Membuat object dan pengisian nilai konstruktor
        Mandor in1 = new Mandor("Mandor", 4500000);
        Tukang in2 = new Tukang("Tukang", 3000000);
        Kuli in3 = new Kuli("Kuli / laden", 2500000);
        
        System.out.println("------- Laporan -------\n---- Kenaikan Gaji ----\n");
        in1.naik();
        in1.out();
        in2.naik();
        in2.out();
        in3.naik();
        in3.out();
    }
    
}
