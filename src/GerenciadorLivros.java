import com.sun.source.tree.TryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorLivros {
    ArrayList<String> Livros = new ArrayList<String>();
//    Scanner sc = new Scanner(System.in);

    public void CadastrarLivro(String nomeLivro){
        try{
            Livros.add(nomeLivro);
            System.out.printf("Livro  %s cadastrado com sucesso!", nomeLivro);

        }catch (Exception e){
            System.out.println(e);
        }

    }
    public void ListarLivros(){

        System.out.println("\nLivros cadastrados: \n");
        for(String livro : Livros){
            System.out.println(Livros.indexOf(livro) + 1 + " " + livro);
        }

    }
    public void AtualizarLivro(int indexLivroAtual, String novoNome){
        try{
            String nomeAtual = Livros.get(indexLivroAtual);
            Livros.set(indexLivroAtual, novoNome);
            System.out.printf("Livro %s atualizado para %s com sucesso!", nomeAtual, novoNome);
        }catch (Exception e){
            System.out.println(e);
        }


    }
    public void ExcluirLivro(int indexLivroExcluir){
        try{
            String nomeLivro = Livros.get(indexLivroExcluir);
//            int indexLivro = Livros.indexOf(nomeLivro);
            Livros.remove(indexLivroExcluir);
            System.out.printf("Livro %s excluido com sucesso!", nomeLivro);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
