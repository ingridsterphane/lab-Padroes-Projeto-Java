package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso".
 * @author Ingrid
 *
 *
 */

public class Singletonlazy {
    private static Singletonlazy instancia;

    private Singletonlazy() {
        super();
    }
    public static Singletonlazy getInstancia() {
        if (instancia == null) {
            instancia = new Singletonlazy();
        }
        return instancia;
    }
}
