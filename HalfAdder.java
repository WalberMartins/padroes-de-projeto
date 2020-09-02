public class HalfAdder {

    private boolean entrada1;
    private boolean entrada2;

    public HalfAdder() {
        entrada1 = entrada2 = false;
    }

    public void setEntrada1(int entrada1) {
        if(!(OperacoesLogicas.eBinario(entrada1)))
            throw new IllegalArgumentException("esse valor não é binário!");
        this.entrada1 = !(entrada1 == 0);
    }

    public void setEntrada2(int entrada2) {
        if(!(OperacoesLogicas.eBinario(entrada2)))
            throw new IllegalArgumentException("esse valor não é binário!");
        this.entrada2 = !(entrada2 == 0);
    }

    public int sum() {
        return OperacoesLogicas.xor(entrada1, entrada2) ? 1:0;
    }

    public int carryOut() {
        return OperacoesLogicas.and(entrada1, entrada2) ? 1:0;
    }

    @Override
    public String toString() {
        return "Sum = "+sum()+", Carry Out= "+carryOut();
    }

}