package tda.listassimple;

import tda.excepciones.ListaVaciaException;
import tda.excepciones.ParametroInvalidoException;

/**
 * <p>Representa una lista</p>
 */
public class Lista {

    private Nodo cab;    //el nodo cabeza de la lista

    /**
     * <p>Adiciona un nodo antes del nodo cabeza</p>
     *
     * <p><b>precondición</b></p>
     * La información para el nuevo nodo debe existir
     *
     * <p><b>postcondicion</b></p>
     * Un nuevo nodo antes de la cabeza
     *
     * @param dato La información del nodo
     * @throws ParametroInvalidoException Se lanza cuando el parámetro es inválido
     */
    public void adicionarNodoAntesCabeza(String dato) throws ParametroInvalidoException{
        //validamos el parámetro
        //si el dato es nulo o vacío se lanza la excepción
        if(dato == null || dato.isEmpty()){
            throw new ParametroInvalidoException("El dato es inválido");
        }

        //verificamos si la lista esta vacia. De ser así se adiciona el nodo
        //y lo asignamos a la cabeza
        if(cab == null){ //la lista esta vacia
            Nodo p = new Nodo(dato);
            cab = p;
        }else{  //si no la lista esta llena
            Nodo p = new Nodo(dato);
            p.sig = cab;
            cab = p;
        }

    }


    /**
     * <p>recorre la lista y se imprime el valor del nodo</p>
     *
     * <p><b>precondición</b></p>
     * La lista no puede estar vacia
     *
     * <p><b>postcondición</b></p>
     * La impresión de la información de los nodos que componen la lista
     *
     * @throws ListaVaciaException Se lanza cuando la lista está vacía
     */
    public void imprimirLista() throws ListaVaciaException{
        //validamos que la lista no este vacia
        //no se puede imprimir una lista vacia
        if(cab == null){
            throw new ListaVaciaException("La lista está vacía, no se puede imprimir");
        }

        Nodo p = cab;   //lo utilizo para recorrer la lista, si se usa cabeza se pierde la referencia

        //recorre la lista hasta llegar al null del siguiente del último nodo
        while (p != null){
            System.out.println("[" + p.dato + "]"); //imprimo el valor del nodo p
            p = p.sig; //adelanto al siguiente nodo
        }
    }
}
