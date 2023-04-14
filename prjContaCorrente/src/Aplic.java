
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {
    public static void main(String[] args) {
        int numero;
        double saldo;
        
        //instanciação dos objetos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        numero = entrada.nextInt();
        
        System.out.print("Digite o saldo da conta: ");
        saldo = entrada.nextDouble();
        
        ContaCorrente objConta = new ContaCorrente(numero, saldo);
        
        int opcao;
        
        do{
            System.out.println();
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair\n");
            
            System.out.print("  Digite a opção: ");
            opcao = entrada.nextInt();
            System.out.println();
            
            switch(opcao){
                case 1:
                    System.out.println("Número da conta: " + objConta.getNumero());
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = entrada.nextDouble(); 
                    objConta.depositar(deposito);
                break;
                
                case 2:
                    System.out.println("Número da conta: " + objConta.getNumero());
                    System.out.print("Digite o valor de saque: ");
                    double saque = entrada.nextDouble();
                    objConta.sacar(saque);
                    break;
                
                case 3:
                    System.out.println("Número da conta: " + objConta.getNumero());
                    System.out.print("Consulta de Saldo: " + objConta.getSaldo());
                    break;
   
                default:
                    if(opcao > 4){
                    System.out.println("Opção inválida");
                    }
                    break;
            }
        } while(opcao != 4);
        
        entrada.close(); 
    }
}