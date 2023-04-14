import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author ascari
 */

public class Aplic {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Livro objLivro = new Livro();
        
        int identificacao;
        double valMultaDiaria;
        
        System.out.print("Digite a identificação do livro: ");
        identificacao = entrada.nextInt();
        objLivro.setIdentificacao(identificacao);
        
        System.out.print("Digite o valor da multa diaria: ");
        valMultaDiaria = entrada.nextDouble();
        objLivro.setValMultaDiaria(valMultaDiaria);
         
        int opcao;
        
        do{
            System.out.println("\n1 - Consultar livro ");
            System.out.println("2 - Emprestar livro ");
            System.out.println("3 - Devolver livro ");
            System.out.println("4 - Sair\n");
            
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();
            System.out.println();
            
            switch(opcao){
                case 1:
                    if(objLivro.getSituacao()){
                        System.out.println("O livro não está disponível");
                    } else{
                        System.out.println("O livro está disponível");
                    }
                break;
                
                case 2:
                    objLivro.emprestar();
                    break;
                
                case 3:
                    System.out.print("Digite a quantidade de dias em atraso: ");
                    int diasDeAtraso = entrada.nextInt();     
                    objLivro.devolver(diasDeAtraso);
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
