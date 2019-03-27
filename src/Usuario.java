import java.util.ArrayList;
public class Usuario {
	
	
		private String login;
		private String senha;
		public ArrayList <Tweet> tweets;

		 public void setLogin(String log){
				
				this.login=log;
			}
		
		 public String getLogin(){
		    	return this.login;
		    }
		 
		 public void setSenha(String password){
				
				this.senha=password;
			}
		
		 public String getSenha(){
		    	return this.senha;
		    }
		 public Usuario()
		 {
			 this.tweets=new ArrayList<>();
			 
		 }
		 
		 public  void efetuarLogin ()
		 {
			 if (senha.equalsIgnoreCase("poo"))
				 System.out.println( "Login realizado");
			 else
			{System.out.println( "Acesso negado");
			 System.exit(0);	
			}
				 				
				
		 }
		 
		 public  void listar ()
		 {
			 System.out.println("Usuário: "+ login);
			 for(int i = 0; i < tweets.size(); i++) 
			 {
				 System.out.println((tweets.get(i).getDescricao()));
			 }  
		 }
		 
}
