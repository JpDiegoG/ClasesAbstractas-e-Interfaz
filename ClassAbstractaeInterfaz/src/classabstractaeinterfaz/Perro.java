package classabstractaeinterfaz;


public class Perro extends Animal implements Mascota{

    public Perro(int edad, String nombre) {
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

    @Override
    public void jugar() {
        System.out.println(nombre+" esta jugando con su pelota."); 
    }

    @Override
    public void mostarCariño() {
        System.out.println(nombre+" mueve su cola.");
    }
    
}