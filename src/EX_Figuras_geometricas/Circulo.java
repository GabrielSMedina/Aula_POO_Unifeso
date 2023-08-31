package EX_Figuras_geometricas;

public class Circulo extends Forma{

    public Circulo(int raio){
        this.area = calculaArea(raio);
        this.perimetro = calculaPerimetro(raio);
    }
    public Double calculaArea(int raio) {
        return 3.14 * (raio*raio);
    }

    public Double calculaPerimetro(int raio){
        return 2 * 3.14 * raio;
    }
}
