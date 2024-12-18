
package classabstractaeinterfaz;


public class ClassAbstractaeInterfaz {


    public static void main(String[] args) {
        Perro perro = new Perro(4, "Rocky");
        perro.jugar();
        perro.mostarCariño();
        
        System.out.println();
        
        Pez pez = new Pez(1, "Dory");
        pez.comer();
        pez.dormir();
    }
    
}
