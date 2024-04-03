package model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar(){
        if(disponivel == true){
            disponivel = false;
        }else{
            System.out.println("Livro indisponível");
        }
    }
    public void devolver(){
        if(disponivel == false){
            disponivel = true;
        }else{
            System.out.println("Livro já disponível");
        }
    }
    public String getTitulo(){
        return titulo;
    }

    public String toString(){
        return "Livro: " + titulo + "\n" + "Autor: " + autor + "\n" + " Disponível: " + disponivel;
    }
}
