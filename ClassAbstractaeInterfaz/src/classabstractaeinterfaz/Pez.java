package classabstractaeinterfaz;


public class Pez extends Animal{

    public Pez(int edad, String nombre) {
        super(edad, nombre);
        if(edad<=0){
            throw new IllegalArgumentException("La edad debe ser mayor o igual a cero");
        }
    }
    
    
    @Override
    public void comer() {
        System.out.println(nombre+" esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre+" Esta durmiendo.");
    }
    
}
