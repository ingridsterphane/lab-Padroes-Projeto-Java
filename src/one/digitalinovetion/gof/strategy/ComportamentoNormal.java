package one.digitalinovetion.gof.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Funcionando Normal...");
    }
}
