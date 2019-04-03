import java.io.InputStream;
import java.util.Scanner;
public class Testtwwet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Usuario user=new Usuario();
        
		//Inserir login      
        System.out.println("Entre com o login:");
        user.setLogin (input.next());
        
        //Inserir senha
        System.out.println("Entre com a senha");
        user.setSenha (input.next());
        
        
        //Verificar login
         user.efetuarLogin();
        
        //Se auteticado, pedir para inserir tweet
        int i=1;
        
        while (i==1)
        {		
        	 System.out.println("Entrar com tweet:");
             Tweet tweet= new Tweet();             
             tweet.setDescricao(input.next());             
             user.tweets.add(tweet);
             
             //Verificar se deseja twitar novamente
             System.out.println("Deseja continuar? s/n");
             String resposta= input.next();
             
             if(resposta.equalsIgnoreCase("n"))
            	 i=0;             	 
                    	
        }       
                
        
        user.listar ();
        
        input.close();
	}

}
