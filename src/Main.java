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
import EX_Figuras_geometricas.Circulo;

public class Main {
    public static void main(String[] args) {

        //ContatoInterface contatoInterface = new ContatoInterface();
        //contatoInterface.executar();

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();

        circulo1.calculaArea(2.0);
        circulo2.calculaArea(6.0);

        System.out.println(circulo1.getArea());
        System.out.println(circulo2.getArea());

    }
}