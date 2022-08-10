package candidatura;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
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
