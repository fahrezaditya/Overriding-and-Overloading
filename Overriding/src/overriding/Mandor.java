
package overriding;

// Class induk yg di override
public class Mandor {
    
    // Menggunakan variable instance supaya bisa digunakan dalam semua method
    public String jabatan;
    public double gaji, gaji1;
    
    // Method dengan konstrukor 
    public Mandor (String jabatan, double gaji){
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    public void naik (){
        gaji1 = gaji*130/100;
    }
    
    public void out (){
    
        System.out.println("Jabatan\t   : "+jabatan);
        System.out.println("Gaji awal  : Rp "+gaji);
        System.out.println("Gaji akhir : Rp "+gaji1+"\n");
    }
}
