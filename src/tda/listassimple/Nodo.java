package tda.listassimple;

/**
 * <p>define un nodo de una lista</p>
 */
public class Nodo {

    public String dato; //la información que contienen el nodo
    public Nodo   sig;  //referencia al siguiente nodo

    /**
     * <p>crea una instancia de un nodo</p>
     * @param dato el valor de la información que contiene el nodo
     */
    public Nodo(String dato) {
        this.dato = dato;   //el nodo contienen ahora el valor de dato
        this.sig = null;    //el siguiente ahora es null
    }
}
