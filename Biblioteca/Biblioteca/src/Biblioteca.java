import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int menus;
        
        Livros lr = new Livros();
        Usuario cl = new Usuario();
        
                
        System.out.println("Digite seu usuario: ");
        System.out.printf(" %0,2d- %s\n"); 
        cl.setLogin(ler.nextLine());
        
        System.out.println("Digite sua senha: ");
        cl.setPassword(ler.nextLine());
        
           System.out.println("Infomrme a opção desejada" + "\n" + "1 - Buscar Livro" + "\n" + "2 - Cadastrar livro" + "\n" + "3 - emprestar" + "\n" + "4 - devolver"+ "\n" + "5 - Sair");
        menus = ler.nextInt();
        
        switch(menus) {
            case 1:
                System.out.println("Buscar Livro");
                break;
            case 2:
                System.out.println("Cadastrar livro");
                break;
            case 3:
                System.out.println("emprestar");
                break;
            case 4:
                System.out.println("devolver");
                break;
            case 5:
                System.out.println("Sair");
                break;
                
            default:
                System.out.println("Escolha os menus de 1 e 5");
                break;
                
    }

    if(menus == 1){
        System.out.println("Informe o titulo do livro dentre os genero abaixo:");
        Livros l1 = new Livros();
        System.out.println("Digite o titulo do Livro: ");
        
        
        
    }
    else if(menus == 2){
        System.out.println("Informe o titulo do livro que deseja cadastrar: ");
        ArrayList<String> livros = new ArrayList<>();
        livros.add(ler.nextLine());
        System.out.println("Livro cadastrado com sucesso ");
        
        int i;

        System.out.println("Selecione: ");
        int n = livros.size();
        for (i = 0; i < n; i++) {
            System.out.printf(" %d - %s \n", i, livros.get(i));
        }
        
        
        
        
    }
     else {
    return;
        
    }
}
    
}
