public class OperacoesLogicas {

    public static boolean not(boolean operando) {
        if(operando)
            return false;
        return true;
    }

    public static boolean and(boolean operando1, boolean operando2) {
        int op1 = operando1 ? 1:0;
        int op2 = operando2 ? 1:0;

        if(op1 * op2 == 1)
            return true;
        return false;
    }

    public static boolean or(boolean operando1, boolean operando2) {
        int op1 = operando1 ? 1:0;
        int op2 = operando2 ? 1:0;

        if(op1 + op2 == 0)
            return false;
        return true;
    }

    public static boolean xor(boolean operando1, boolean operando2) {
               //expressão: ~(p ^ q) ^ (p v q)
        return and((not(and(operando1, operando2))), or(operando1, operando2));   
    }

    public static boolean eBinario(int digito) { 
        return (or(digito == 0, digito == 1));
    }
    
}