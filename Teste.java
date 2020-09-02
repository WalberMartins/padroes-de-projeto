import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String binarioString;
        int quantBits = 8;
        
        System.out.println("Somador completo de 8 bits");
        System.out.print("Digite o primeiro número em binário: ");
        binarioString = sc.nextLine();
        int[] binarioArray1 = binarioParaIntArray(binarioString, quantBits);
        

        System.out.print("Digite o segundo número em binário: ");
        binarioString = sc.nextLine();
        int[] binarioArray2 = binarioParaIntArray(binarioString, quantBits);

        int[] soma = somadorCompleto(binarioArray1, binarioArray2, quantBits);

        System.out.println(" "+Arrays.toString(binarioArray1)
        .replaceAll("\\W", "").replaceAll("^0+", " ")+" = "+binarioArrayParaInt(binarioArray1));
        System.out.println("+");
        System.out.println(" "+Arrays.toString(binarioArray2)
        .replaceAll("\\W", "").replaceAll("^0+", " ")+" = "+binarioArrayParaInt(binarioArray2));
        System.out.println(" ---------");
        System.out.println(" "+Arrays.toString(soma)
        .replaceAll("\\W", "").replaceAll("^0+", " ")+" = "+binarioArrayParaInt(soma));

        sc.close();
    }

    private static int[] somadorCompleto(int[] binarioArray1, int[] binarioArray2, int quantBits) {
        int[] soma = new int[quantBits];
        FullAdder fa = new FullAdder();

        for(int i = (soma.length-1); i >= 0; i--) {
            fa.setCarryIn(fa.carryOut());
            fa.setEntrada1(binarioArray1[i]);
            fa.setEntrada2(binarioArray2[i]);
            soma[i] = fa.sum();
        }
        return soma;
    }

    private static int[] binarioParaIntArray(String binarioString, int quantBits) {
        int count = 0;
        int[] binarioArray = new int[quantBits];
        for(int i = 0; i < binarioArray.length; i++) {
            if(i < (binarioArray.length - binarioString.length()))
                binarioArray[i] = 0;
            else {
                binarioArray[i] = Integer.parseInt(Character.toString(binarioString.charAt(count)));
                count++;
            }
        }

        return binarioArray;
    }

    private static int binarioArrayParaInt(int[] binarioArray) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < binarioArray.length; i++) 
            sb.append(binarioArray[i]);
            
        return Integer.parseInt(sb.toString(), 2);
    }
    
}