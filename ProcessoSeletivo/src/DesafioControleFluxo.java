
import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: -");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo valor: -");
        int segundoNumero = sc.nextInt();
        try {
            contar(primeiroNumero, segundoNumero);
            sc.close();
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            System.out.println("O primeiro valor é menor que o segundo");
            throw new ParametrosInvalidosException(null);
        } else {
            int contador = parametroUm - parametroDois;
            for (int i = 0; i <= contador; i++) {
                System.out.println(i);
            }
        }
    }
    
}
