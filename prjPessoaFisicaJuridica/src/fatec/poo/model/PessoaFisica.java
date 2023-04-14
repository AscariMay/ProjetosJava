package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class PessoaFisica extends Pessoa {

    private String CPF;
    private double base;

    public PessoaFisica(String CPF, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.CPF = CPF;
    }

    @Override
    public double calcBonus(int anoAtual) {
        anoAtual = 2023;

        if (getTotalCompras() > 12000) {
            return ((anoAtual - getAnoInscricao()) * this.base);
        }
        return 0;
    }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
}
