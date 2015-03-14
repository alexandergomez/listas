package tda.excepciones;

/**
 * <p>Define una excepción cuando la lista está vacia</p>
 */
public class ListaVaciaException extends Exception{

    /**
     * <p>crea una instancia de la excepcion</p>
     * @param msg el mensaje a mostrar
     */
    public ListaVaciaException(String msg) {
        super(msg);
    }
}
