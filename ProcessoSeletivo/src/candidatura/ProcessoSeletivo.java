package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
                System.out.println(); 
            }
        } while (continuarTentando && tentativasRealizadas<3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " VEZ");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
        }
        
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato  de n: " + i + " - " + candidatos[i] + "\n");
        }

        System.out.println("Forma abreviada de interação: ");
        for (String candidato : candidatos) {
            System.out.println("O candidato é: " + candidato + "\n");
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio", "José", "Rafael", "Paulo", "Carla", "Bruno", "Paula", "Júlio", "Ricardo", "Márcio"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário : " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                System.out.println();
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

        static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.0;
            if (salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO");
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
            } else {
                System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            }
        }
    }
