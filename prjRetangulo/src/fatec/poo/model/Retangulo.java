package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class Retangulo {
    private double altura;
    private double base;
    String unidadeMedida;

    public Retangulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public void setAltura(double a){
        altura = a;
    }
    public void setBase(double b){
        base = b;
    }
    public double getAltura(){
        return(altura);
    }
    public double getBase(){
        return(base);
    }
    public double calcArea(){
        return(altura * base);
    }
    public double calcPerimetro(){
        return(2 * (altura + base));
    }
        public double calcDiagonal(){
        return(Math.exp(base) + Math.pow(altura,base));
    }
}
