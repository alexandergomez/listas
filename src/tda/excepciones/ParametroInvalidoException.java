package tda.excepciones;

/**
 * <p>Define una excepción cuando el parámetro es vacío o nulo</p>
 */
public class ParametroInvalidoException extends Exception{

    /**
     * <p>crea una instancia de la excepción</p>
     * @param msg el mensaje a mostrar
     */
    public ParametroInvalidoException(String msg) {
        super(msg);
    }
}
