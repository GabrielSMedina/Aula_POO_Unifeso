package EX_Figuras_geometricas;

public class Trapezio extends Forma{

    public Trapezio(Double altura, Double lado1, Double lado2, Double base1, Double base2){
        this.area = calculaArea(altura, base1, base2);
        this.perimetro = calculaPerimetro(lado1, lado2, base1, base2);
    }

    private Double calculaArea(Double altura, Double base1, Double base2) {
        return (altura / 2) * (base1 + base2);
    }

    private Double calculaPerimetro(Double lado1, Double lado2, Double base1, Double base2) {
        return lado1 + lado2 + base1 + base2;
    }
}
