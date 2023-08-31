/*

Funcionalidades:
– Inclusão de contatos
– Localização de um contato
– Exclusão de um contato
– Listagem dos contatos

Classes que serão criadas:
– Classe de entidade EX_Contatos.Contato
– Classe de controle ControladorContato
– Classe de interface InterfaceContato
 */

import EX_Contatos.ContatoInterface;

public class Main {
    public static void main(String[] args) {

        ContatoInterface contatoInterface = new ContatoInterface();
        contatoInterface.executar();

    }
}