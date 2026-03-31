import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorLivros glivros = new GerenciadorLivros();
        Scanner sc = new Scanner(System.in);
        boolean continuarRodando = true;
        String nomeLivro;

        do {
            System.out.println("\n----Gerenciador de livros----");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar Livro");
            System.out.println("3 - Atualizar Livro");
            System.out.println("4 - Excluir Livro");
            System.out.println("0 - SAIR");
            System.out.println("Digite uma opção:");
            int opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o nome do livro:");
                    String livro = sc.nextLine();
                    glivros.CadastrarLivro(livro);
                    break;
                case 2:
                    if(glivros.Livros.size() == 0){
                        System.out.println("Não há livros cadastrados!");
                    }else{
                    glivros.ListarLivros();

                    }
                    break;

                case 3:
                    glivros.ListarLivros();
                    System.out.println("Digite o numero do livro que deseja atualizar: ");
                    sc.nextLine();
                    int indexLivroAtual = sc.nextInt();
                    if(indexLivroAtual <= glivros.Livros.size()){
                        System.out.println("Livro encontrado!");
                        System.out.println("Digite o novo valor do livro: ");
                        sc.nextLine();//limpar o cache apenas
                        String novoNome = sc.nextLine();
                        glivros.AtualizarLivro(indexLivroAtual -1, novoNome);
                    }else{
                        System.out.println("Livro não encontrado, tente novamente.");
                    }
                     break;
                case 4:
                    glivros.ListarLivros();
                    System.out.println("Digite o numero do livro a ser exlcuido: ");
                    int indexLivroExcluir = sc.nextInt();
                    if(glivros.Livros.size() <= indexLivroExcluir){
                        System.out.println("Tem o livro.. vamos excluir");
                        glivros.ExcluirLivro(indexLivroExcluir -1);
                    }else{
                        System.out.println("Livro não encontrado, tente novamente");
                    }
                    break;

                case 0:
                    continuarRodando = false;
                    break;

                default:
                    System.out.println("Opção não encontrada!");
                    break;



            }
        }while (continuarRodando);
        System.out.println("Encerrando programa, até a próxima!");
    }
}







