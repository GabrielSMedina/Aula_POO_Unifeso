package EX_Contatos;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoInterface {
    private Scanner scanner;
    private ContatoController contatoController;
    public ContatoInterface(){
        scanner = new Scanner(System.in);
        contatoController = new ContatoController();
    }

    private int obterOpcao(){
        System.out.println("1. Incluir");
        System.out.println("2. Localizar");
        System.out.println("3. Excluir");
        System.out.println("4. Listar");
        System.out.println("0. Sair");
        System.out.println("Opcao: ");
        return scanner.nextInt();
    }

    private void incluirContato(){
        String nome;
        String telefone;
        String email;
        System.out.print("Nome: ");
        nome = scanner.next();
        System.out.print("Telefone: ");
        telefone = scanner.next();
        System.out.print("Email: ");
        email = scanner.next();
        Contato contato = new Contato(nome, telefone, email);
        contatoController.addContato(contato);
    }

    private void localizarContato(){
        String nome;
        System.out.print("Informe o nome: ");
        nome = scanner.next();
        Contato contato = contatoController.getContatoByNome(nome);
        if (contato != null){
            System.out.println("EX_Contatos.Contato\n"+
                    "Nome: "+contato.getNome()+"\n"+
                    "Telefone: "+contato.getTelefone()+"\n"+
                    "Email: "+contato.getEmail());
        } else {
            System.out.println("EX_Contatos.Contato nao encontrado");
        }
    }

    private void excluirContato(){
        String nome;
        System.out.print("Informe o nome: ");
        nome = scanner.next();
        Contato contato = contatoController.getContatoByNome(nome);
        if (contato != null){
            contatoController.removeContato(contato);
            System.out.println("EX_Contatos.Contato excluido");
        } else {
            System.out.println("EX_Contatos.Contato nao encontrado");
        }
    }

    private void listarContatos(){
        ArrayList<Contato> contatos = contatoController.getContatos();
        Contato contato = null;
        for (Contato value : contatos) {
            contato = value;
            System.out.println("Nome: " + contato.getNome() +
                    " Telefone: " + contato.getTelefone() +
                    " Email: " + contato.getEmail());
        }
    }

    public void executar() {
        int opcao = 0;
        do{
            opcao = obterOpcao();
            switch (opcao) {
                case 1 -> incluirContato();
                case 2 -> localizarContato();
                case 3 -> excluirContato();
                case 4 -> listarContatos();
            }
        } while (opcao != 0);
    }

}
