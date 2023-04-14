package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class PessoaJuridica extends Pessoa {

    private String CGC;
    private double taxaIncentivo;

    public PessoaJuridica(String CGC, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.CGC = CGC;
    }

    @Override
    public double calcBonus(int anoAtual) {
        anoAtual = 2023;
        return (this.taxaIncentivo * getTotalCompras()) * (anoAtual - getAnoInscricao());
    }

    public void setTaxaIncentivo(double taxa) {
        taxaIncentivo += taxa;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

}
