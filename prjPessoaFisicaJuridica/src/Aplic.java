
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author ascari
 */
public class Aplic {

    public static void main(String[] args) {
        int anoAtual = 2023;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        PessoaFisica funcPf = new PessoaFisica("23456789", "Pedro Silveira", 2010);

        PessoaJuridica funcPj = new PessoaJuridica("10.123.456/0001-10", "Pedro Silveira", 2000);

        funcPf.addCompras(15000);
        funcPf.setBase(1000);
        System.out.println("CPF                  => " + funcPf.getCPF());
        System.out.println("Nome                 => " + funcPf.getNome());
        System.out.println("Ano Inscrição        => " + funcPf.getAnoInscricao());
        System.out.println("Salario base         => " + df.format(funcPf.getBase()));
        System.out.println("Bonus                => " + df.format(funcPf.calcBonus(anoAtual)));
        
        funcPj.addCompras(1000);
        funcPj.setTaxaIncentivo(0.10);
        System.out.println("\nCGC                  => " + funcPj.getCGC());
        System.out.println("Nome                 => " + funcPj.getNome());
        System.out.println("Ano Inscrição        => " + funcPj.getAnoInscricao());
        System.out.println("Taxa de Incentivo    => " + funcPj.getTaxaIncentivo()*100 + "%");
        System.out.println("Bonus                => " + df.format(funcPj.calcBonus(anoAtual)));

    }

}
