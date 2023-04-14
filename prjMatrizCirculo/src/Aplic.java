
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        String unidade;
        int i;
        //instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        Circulo[] matCirc = new Circulo[10]; // é criado um length associada a matriz. Qtd de elementos = da matrriz

        for (i = 0; i < matCirc.length; i++) {
            System.out.print("\nDigite a unidade de medida: ");
            unidade = entrada.next();
            
            //instanciação do objeto da classe Circulo
            //e chamada do método construtor 
            matCirc[i] = new Circulo(unidade);

            System.out.print("Digite a medida do raio: ");
            medRaio = entrada.nextDouble(); //escolho o valor a ser atribuído na sequência pelo set

            matCirc[i].setRaio(medRaio); //set atribui o valor escolhido anteriormente na variável >medRaio<
        }
        
        //acessando matriz de objetos
        for (i = 0; i < matCirc.length; i++) {
            System.out.println("\nObjeto Circulo: " + (i+1));
            System.out.println("\nMedida do raio: " + matCirc[i].getRaio());
            System.out.println("Área: " + df.format(matCirc[i].calcArea()) + " " + matCirc[i].getUnidadeMedida());
            System.out.println("Perímetro: " + df.format(matCirc[i].calcPerimetro()) + " " + matCirc[i].getUnidadeMedida());
            System.out.println("Diâmetro: " + df.format(matCirc[i].calcDiametro()) + " " + matCirc[i].getUnidadeMedida());
        }
    }
}
