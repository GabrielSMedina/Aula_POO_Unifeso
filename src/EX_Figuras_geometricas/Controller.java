package EX_Figuras_geometricas;

import java.util.ArrayList;

public class Controller {

    private ArrayList<Forma> formas;

    public Controller(){ formas = new ArrayList<Forma>(); }

    public void addForma(Forma forma) { formas.add(forma); }

    public ArrayList<Forma> getFormas() {
        return formas;
    }
}
