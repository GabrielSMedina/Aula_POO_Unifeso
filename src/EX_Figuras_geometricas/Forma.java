package EX_Figuras_geometricas;

/*
Fazer um programa para calcular a área e o
perímetro de uma quantidade indeterminada das
seguintes figuras geométricas: retângulo, triângulo,
círculo, trapézio. As figuras devem ser mantidas pelo
sistema. Deve haver uma opção para listar a área e o
perímetro de todas as figuras.
 */
public class Forma {
    protected Double area;
    protected Double perimetro;

    public Double getArea(){
        return this.area;
    }

    public Double getPerimetro(){
        return this.perimetro;
    }

    public void setArea(Double area){
        this.area = area;
    }

    public void setPerimetro(Double perimetro){ this.perimetro = perimetro;}
}
