
import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        Cliente objCliente = new Cliente("111.222.333-44", "Sirius Black", "2020-5656");
        Instrutor objInst = new Instrutor(10, "João Carlos", "3030-6565");

        objCliente.setPeso(70);
        objCliente.setAltura(1.75);
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
        System.out.println("IMC: " + df.format(objCliente.calcIMC()));

        objInst.setAreaAtuacao("Educador Físico");        
        System.out.println("\nNome: " + objInst.getNome());
        System.out.println("Telefone: " + objInst.getTelefone());
        System.out.println("Identificação: " + objInst.getIdentificacao());
        System.out.println("Area de atuação: " + objInst.getAreaAtuacao());
    }

}
