
package classabstractaeinterfaz;

public abstract class Animal{
    protected int edad;
    protected String nombre;

    protected Animal(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public abstract void comer();
    public abstract void dormir();
}
