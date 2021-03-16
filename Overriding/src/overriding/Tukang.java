
package overriding;

// inheritance
public class Tukang extends Mandor{
    
    public Tukang (String nama, int gaji){
        super(nama, gaji);
    }
    
    @Override
    public void naik (){
        gaji1 = gaji*150/100;
    }
}
