import java.util.Scanner;

public class Usuario {
    
    private String login;
    private String password;
    
    
    
    public Usuario(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

        if(this.login != "Admin" && this.password != "Admin" ) {
            System.out.println("Bem vindo!");
            
        }
         else {
            System.out.println("Tente novamente");
            
        }


    }

    
        
       
        
    
    
    

   
       
  
}  