package EX_Contatos;

import java.util.ArrayList;

public class ContatoController {
    private ArrayList<Contato> contatos;
    public ContatoController(){
        contatos = new ArrayList<Contato>();
    }
    public void addContato(Contato contato){
        contatos.add(contato);
    }
    public void removeContato(Contato contato){
        contatos.remove(contato);
    }

    public Contato getContatoByNome(String nome){
        Contato contato = null;
        for (Contato value : contatos) {
            if (value.getNome().equals(nome)) {
                contato = value;
                break;
            }
        }
        return contato;
    }
    public ArrayList<Contato> getContatos(){
        return contatos;
    }

}
