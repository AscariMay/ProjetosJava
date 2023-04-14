package fatec.poo.model;

/**
 *
 * @author ascari
 */

public class Livro {
    private int identificacao;
    private boolean situacao = false;
    private double valMultaDiaria;
    
    public void setIdentificacao(int identificacao){
        this.identificacao = identificacao;
    }
    
    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public boolean getSituacao(){
        return situacao;
    }
    
    public void emprestar(){
        if(situacao){
            System.out.println("O livro está emprestado");
        } else{
            situacao = true;
            System.out.println("Emprestando livro");
        }
    }
    
    public double devolver(int diasDeAtraso){
        if(!situacao){   
            System.out.println("\nO livro já está disponível");
            return 0;
        } else {
            situacao = false;
            double multa = valMultaDiaria * diasDeAtraso;
            if(multa > 0){
                System.out.printf("\nValor da multa: R$%.2f\n", multa);
                return multa;
            } else{
               System.out.println("\nLivro devolvido com sucesso");
               return 0; 
            }
        }
    }
}
