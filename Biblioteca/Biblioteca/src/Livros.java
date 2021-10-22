import java.util.ArrayList;

public class Livros {
    public String descLivro;
    
    public Livros(){
        
            
        ArrayList<String> livros = new ArrayList<>();
        livros.add("Ação: As Branquelas");
        livros.add("Romance: Jumaji");
        livros.add("Ficção: Minha mae é uma peça");
        livros.add("Historia: Gadão");
        livros.add("Tecnico: Uma ideia genial");  
        
        int i;

        System.out.println("Selecione: ");
        int n = livros.size();
        for (i = 0; i < n; i++) {
            System.out.printf(" %d - %s \n", i, livros.get(i));
        }

        

       
    }

    
    }
    