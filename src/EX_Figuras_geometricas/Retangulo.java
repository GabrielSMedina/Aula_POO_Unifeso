package EX_Figuras_geometricas;

public class Retangulo extends Forma{

    public Retangulo(Double lado1, Double lado2){
        this.area = calculaArea(lado1, lado2);
        this.perimetro = calculaPerimetro(lado1, lado2);
    }

    private Double calculaPerimetro(Double lado1, Double lado2) {
        return 2 * (lado1 + lado2);
    }

    private Double calculaArea(Double lado1, Double lado2) {
        return lado1 * lado2;
    }
}
