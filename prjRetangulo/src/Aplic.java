
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author ascari
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        String unidade;
        
        //instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a medida da altura: ");
        unidade = entrada.next();
        
        Retangulo objRet = new Retangulo(unidade);        

        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //passagem de mensagens com o objeto da
        //classe Retangulo
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        System.out.println("\nMedida da altura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da área: " + objRet.calcArea() + " " + objRet.getUnidadeMedida() + "²");
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal() + " " + objRet.getUnidadeMedida());
                 
    }
    
}
