//Implementação usando 2 Half Adders
public class FullAdder {

    private HalfAdder half1;
    private HalfAdder half2;

    public FullAdder() {
        half1 = new HalfAdder();
        half2 = new HalfAdder();
    }

    public void setEntrada1(int entrada1) {
        half1.setEntrada1(entrada1);
    }

    public void setEntrada2(int entrada2) {
        half1.setEntrada2(entrada2);
    }

    public void setCarryIn(int carryIn) {
        half2.setEntrada1(carryIn);
    }

    public int sum() {
        half2.setEntrada2(half1.sum());
        return half2.sum();        
    }

    public int carryOut() {
        boolean ha1Carry = !(half1.carryOut() == 0);
        boolean ha2Carry = !(half2.carryOut() == 0); 
        
        return OperacoesLogicas.or(ha2Carry, ha1Carry) ? 1:0;
    }

    @Override
    public String toString() {
        return "Sum = "+sum()+" Carry Out = "+carryOut();
    }

}