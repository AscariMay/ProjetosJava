package fatec.poo.model;

/**
 *
 * @author ascari
 */
public class Circulo {
    private double raio;
    String unidadeMedida;

    public Circulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    public void setRaio(double r){
        raio = r;
    }
    public double getRaio(){
        return(raio);
    }
    public double calcArea(){
        return(Math.PI * Math.pow(raio,2));
    }
    public double calcPerimetro(){
        return(2 * (Math.PI * raio));
    }
        public double calcDiametro(){
        return(2 * raio);
    }
}
