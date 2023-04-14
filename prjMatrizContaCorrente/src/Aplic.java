
import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ContaCorrente[] banco = new ContaCorrente[15];
        int numConta, num, opcao, cont;
        double valor;

        for (cont = 0; cont < banco.length; cont++) {
            System.out.print("Digite o numero da conta: ");
            numConta = entrada.nextInt();
            System.out.print("Digite o saldo inicial: ");
            valor = entrada.nextDouble();
            banco[cont] = new ContaCorrente(numConta, valor);

            do {
                System.out.println();
                System.out.println("\n1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Listar Contas");
                System.out.println("5 - Sair\n");

                System.out.print("  Digite a opção: ");
                opcao = entrada.nextInt();
                System.out.println();

                switch (opcao) {
                    case 1:
                        System.out.print("\nDigite o numero da conta");
                        numConta = entrada.nextInt();
                        for (cont = 0; cont < banco.length; cont++) {
                            if (banco[cont].getNumero() == numConta) {
                                break;
                            }
                        }
                        if (cont == banco.length) {
                            System.out.println("Conta nao cadastrada!");
                        } else {
                            System.out.print("\nDigite o valor depósito: ");
                            banco[cont].depositar(entrada.nextDouble());
                        }
                        break;
                    case 2:
                        System.out.print("\nDigite o numero da conta");
                        numConta = entrada.nextInt();
                        for (cont = 0; cont < banco.length; cont++) {
                            if (banco[cont].getNumero() == numConta) {
                                break;
                            }
                        }
                        if (cont == banco.length) {
                            System.out.println("Conta nao cadastrada!");
                        } else {
                            System.out.print("\nDigite o valor do saque: ");
                            valor = entrada.nextDouble();
                            if (valor > banco[cont].getSaldo()) {
                                System.out.println("Saldo insuficiente!");
                            } else {
                                banco[cont].sacar(valor);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("\nDigite o numero da conta");
                        numConta = entrada.nextInt();
                        for (cont = 0; cont < banco.length; cont++) {
                            if (banco[cont].getNumero() == numConta) {
                                break;
                            }
                        }
                        if (cont == banco.length) {
                            System.out.println("Conta nao cadastrada!");
                        } else {
                            System.out.println("O saldo da conta: " + banco[cont].getSaldo());
                        }
                        break;

                    case 4:
                        System.out.println("\n\tNúmero da Conta\t\tSaldo");
                        for (cont = 0; cont < banco.length; cont++) {
                            System.out.println("\t\t" + banco[cont].getNumero()
                                    + "\t\t" + banco[cont].getSaldo());
                        }
                        break;
                }
            } while (opcao != 5);
        }
    }
}