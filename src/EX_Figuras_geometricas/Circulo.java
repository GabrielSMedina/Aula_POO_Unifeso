package EX_Figuras_geometricas;

public class Circulo extends Forma{


    public void calculaArea(Double raio) {
        Double area = 3.14 * (raio*raio);
        setArea(area);
    }
}
