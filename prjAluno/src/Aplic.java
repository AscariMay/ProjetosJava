
import fatec.poo.model.Aluno;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author ascari
 */
public class Aplic {
	List<Aluno> alunos = new ArrayList<>();
                
    private void exibirMenu(){
	System.out.println("\n\n");
	System.out.println("+-----------------------------------------+");
	System.out.println("|              Menu de Opções             |");
	System.out.println("+-----------------------------------------+");
	System.out.println("| 01 - Exibir Notas das Provas/Trabalhos  |");
	System.out.println("| 02 - Exibir Média dos Trabalhos/Provas  |");
	System.out.println("| 03 - Exibir Média Final                 |");
	System.out.println("| 04 - Sair                               |");
	System.out.println("+-----------------------------------------+");	
    }

    private void cadastrarRA(){
        Scanner entrada = new Scanner(System.in);
       	Aluno objRet = new Aluno();
        
        System.out.print("\nDigite o número do RA do aluno: ");
	objRet.setRA(entrada.nextInt());
    }

    private void cadastrarNotas(){
	Scanner entrada = new Scanner(System.in);
	Aluno objRet = new Aluno();
        
        System.out.print("\nDigite as notas das provas e dos trabalhos!");
		
	System.out.print("\nNota prova 1: ");
	objRet.setNtPrv1(entrada.nextDouble());
	System.out.print("Nota prova 2: ");
	objRet.setNtPrv2(entrada.nextDouble());
	System.out.print("Nota trabalho 1: ");
	objRet.setNtTrab1(entrada.nextDouble());
	System.out.print("Nota trabalho 2: ");
	objRet.setNtTrab2(entrada.nextDouble());
			
	alunos.add(objRet);	
       	entrada.nextLine();// limpa o scanner
    }
       
    private void imprimirNotas(){
        //passagem de mensagens com o objeto da
        //classe Aluno
        for(Aluno objRet : alunos){
        System.out.println("\nNota prova 1: " + objRet.getNtPrv1());
        System.out.println("Nota prova 2: " + objRet.getNtPrv2());
        System.out.println("Nota trabalho 1: " + objRet.getNtTrab1());
        System.out.println("Nota trabalho 2: " + objRet.getNtTrab2());
        }
        alunos.clear();
    }
    
    private void imprimirMedias(){     
        for(Aluno objRet : alunos){
        System.out.println("\nMedia Provas: " + objRet.calcMediaProva());
        System.out.println("Media Trabalhos: " + objRet.calcMediaTrabalho());
        }
        alunos.clear();
    }

    private void imprimirMediaFinal(){     
        for(Aluno objRet : alunos){
        System.out.println("\nMedia Final: " + objRet.calcMediaFinal());
        }
        alunos.clear();
    }
    
    public static void main(String[] args) {
        short opcao = 10;
        
        //instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        Aplic aplic = new Aplic();
               
        do{
            aplic.cadastrarRA();
            aplic.cadastrarNotas();

            aplic.exibirMenu();

            System.out.print("\nOpção escolhida: ");
            opcao = entrada.nextShort();
            
            switch(opcao){
		case 1:
                    aplic.imprimirNotas();
                    break;
		case 2:
                    aplic.imprimirMedias();
                    break;
		case 3:
                    aplic.imprimirMediaFinal();
                    break;
		default:
                aplic.exibirMenu();
                System.out.print("\nOpção inválida!\n");
                aplic.alunos.clear();
			}
	}while(opcao != 4);         
    }   
}