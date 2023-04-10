package one.digitalinovetion.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Funcionando Defensivamente...");
    }
}
