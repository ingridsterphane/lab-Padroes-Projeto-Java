import one.digitalinnovation.gof.SingletonEager;
import one.digitalinnovation.gof.SingletonLazyHolder;
import one.digitalinnovation.gof.Singletonlazy;
import one.digitalinovation.gof.facade.Facade;
import one.digitalinovetion.gof.strategy.*;

public class test {
    public static void main(String[] args) {

        //Singleton

        Singletonlazy lazy = Singletonlazy.getInstancia();
        System.out.println(lazy);
        lazy = Singletonlazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facate

        Facade facade = new Facade();
        facade.migrarCliente("Ingrid","476587593494");
    }
}
