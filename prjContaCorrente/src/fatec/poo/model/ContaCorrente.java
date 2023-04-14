
package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class ContaCorrente {
    
    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double saque) {
        if (saldo < saque) {
        System.out.println("Saldo insuficiente!");
        }
        else{
            saldo -= saque;
        }
    }
    
    public void depositar(double deposito) {
        saldo += deposito;
    }    
}
