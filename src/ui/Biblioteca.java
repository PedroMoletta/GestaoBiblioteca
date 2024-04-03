package ui;
import model.Livro;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private static List<Livro> Lista = new ArrayList<Livro>();
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("\n-------> MENU DE OPCOES <-----");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Listar livros");
            System.out.println("9 - Sair");

            opcao = sc.nextInt();

         while (opcao < 1 || opcao > 9){
            System.out.println("Digite uma opção válida");
            opcao = (sc.nextInt());
        }

        switch (opcao) {
            case 1:
                biblioteca.execCadastrar();
                break;
            case 2:
                biblioteca.execEmprestar();
                break;
            case 3:
                biblioteca.execDevolver();
                break;
            case 4:
                biblioteca.execListar();
                break;
            case 9:
                System.out.println("Saindo...");
                break;

        }

    }while (opcao != 9);

    }

    private void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        String autor;
        String titulo;
        System.out.println("Digite o título do livro: ");
        titulo = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        autor = sc.nextLine();

        while(titulo.isEmpty() || autor.isEmpty()){
            System.out.println("\nTitulo  ou Autor inválidos");
            System.out.println("Digite um título válido");
            titulo = sc.nextLine();
            System.out.println("Digite um autor válido");
            autor = sc.nextLine();
        }

        Livro livro = new Livro(titulo, autor);
        Lista.add(livro);
        System.out.println("Livro cadastrado com sucesso");
    }

    private void execEmprestar() {
        Scanner sc = new Scanner(System.in);
        String titulo;
        System.out.println("Digite o título do livro: ");
        titulo = sc.nextLine();

        while (titulo.isEmpty()){
            System.out.println("Título inválido");
            System.out.println("Digite um título válido");
            titulo = sc.nextLine();

        }
        for(Livro livro : Lista){
            if(livro.getTitulo().equals(titulo)){
                livro.emprestar();
                return;
            }
        System.out.println("######-Livro emprestado!-######\n");
    }
    }

    private void execDevolver() {
        Scanner sc = new Scanner(System.in);
        String titulo;
        System.out.println("Digite o título do livro: ");
        titulo = sc.nextLine();

        while(titulo.isEmpty()){
            System.out.println("Título inválido");
            System.out.println("Digite um título válido");
            titulo = sc.nextLine();
        }
        for(Livro livro : Lista){
            if(livro.getTitulo().equals(titulo)){
                livro.devolver();
                return;
            }
        }
    }

    private void execListar() {
        for(Livro livro : Lista){
            System.out.println(livro);
        }
    }


}


