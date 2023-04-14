
package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class Professor extends Pessoa {

   private int regFuncional;
   private double salario;

    public Professor(int regFuncional, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.regFuncional = regFuncional;
    }

    public void setSalario(double mensalidade) {
        this.salario = mensalidade;
    } 
    
    public int getRegFuncional() {
        return regFuncional;
    }

    public double getSalario() {
        return salario;
    }
}
