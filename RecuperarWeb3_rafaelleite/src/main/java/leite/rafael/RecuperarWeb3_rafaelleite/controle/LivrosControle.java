package leite.rafael.RecuperarWeb3_rafaelleite.controle;

import leite.rafael.RecuperarWeb3_rafaelleite.modelo.Livros;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

public class LivrosControle {
    @GetMapping("/")
    public String getMensagem() {
        return "Projeto de recuperação WEB III com Spring.";
    }

    @GetMapping("/Livros")
    public ArrayList<Livros> getLivros() {

        Livros Livro1 = new Livros();

        Livro1.setTitulo("Eletrônica Analógica Básica");
        Livro1.setAutor("Marcelo de Almeida Duarte");
        Livro1.setCategoria("Técnico");
        Livro1.setEditora("LTC");
        Livro1.setEdicao("1º");
        Livro1.setPaginas("300");
        Livro1.setIdioma("Portugues");
        Livro1.setLancamento("2014");

        ArrayList<Livros> Livros = new ArrayList<>();
        Livros.add(Livro1);

        return Livros;
    }

}
