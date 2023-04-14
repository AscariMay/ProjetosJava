
import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        String unidade;
        
        //instanciação dos objetos
        Scanner entrada = new Scanner(System.in);        
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        Circulo objCirc = new Circulo(unidade);
                
        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        //passagem de mensagens com o objeto da
        //classe Circulo
        objCirc.setRaio(medRaio);
        System.out.println("\nMedida do raio: " + objCirc.getRaio());
        System.out.println("Medida da área: " + objCirc.calcArea() + " " + objCirc.getUnidadeMedida());
        System.out.println("Medida do perímetro: " + objCirc.calcPerimetro() + " " + objCirc.getUnidadeMedida());
        System.out.println("Medida do diâmetro: " + objCirc.calcDiametro() + " " + objCirc.getUnidadeMedida());
        
    }    
}