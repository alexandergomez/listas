package tda.listassimple;

import tda.excepciones.ListaVaciaException;
import tda.excepciones.ParametroInvalidoException;

/**
 * <p>realiza prueba de la lista</p>
 */
public class Prueba {

    public static void main(String[] args) {

        //crea una lista
        Lista lista = new Lista();

        try {
            lista.adicionarNodoAntesCabeza("Juan");
            lista.adicionarNodoAntesCabeza("Pedro");
            lista.adicionarNodoAntesCabeza("Carlos");
            lista.adicionarNodoAntesCabeza("María");
            lista.adicionarNodoAntesCabeza("Magally");
            lista.adicionarNodoAntesCabeza("Luisa");
            lista.adicionarNodoAntesCabeza("Luz");
        } catch (ParametroInvalidoException e) {
            e.printStackTrace();
        }

        try {
            lista.imprimirLista();
        } catch (ListaVaciaException e) {
            e.printStackTrace();
        }

    }
}
