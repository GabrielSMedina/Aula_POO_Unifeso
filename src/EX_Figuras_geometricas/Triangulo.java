package EX_Figuras_geometricas;

import static java.lang.Math.sqrt;

public class Triangulo extends Forma{

    public Triangulo(Double cateto1, Double cateto2){
        this.area = calculaArea(cateto1, cateto2);
        this.perimetro = caculaPerimetro(cateto1, cateto2);
    }

    private Double caculaPerimetro(Double cateto1, Double cateto2) {
        Double hipotenusa = sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        return cateto1 + cateto2 + hipotenusa;
    }

    private Double calculaArea(Double cateto1, Double cateto2) {
        return (cateto1 * cateto2) / 2;
    }
}
