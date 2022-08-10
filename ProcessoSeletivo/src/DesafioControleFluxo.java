

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
        } catch (ParametrosInvalidosException e) {
            //TODO: handle exception
        }

        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contador = parametroUm - parametroDois;
            for (int i = 0; i <= contador; i++) {
                System.out.println(i);
            }
        }
    }
}
