
package overriding;

public class Kuli extends Mandor {
    
    public Kuli (String nama, int gaji){
        super(nama, gaji);
    }
    
    @Override
    public void naik (){
        gaji1 = gaji*115/100;
    }
}
