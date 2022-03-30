import java.util.Scanner;
import manageAcc.ManageAccount;

public class JavaP2 {
	
	String login, password, nickname;
	
	public void BasicAccountInfo(String login, String password, String nickname) {
		this.login = login;
		this.nickname = nickname;
		this.password = password;
	}
	
    public static void main(String[] args) {
    	
    	Scanner readLine = new Scanner(System.in);
    	
    	while(true) {
    		
    		System.out.println("Escolha uma opção:\n0: Mostrar todas as contas\n1: Criar conta\n2: Editar perfil\n3: Remover conta\n4: Recuperar informações sobre um usuário\n5: Sair");
    		
    		int OPTION = readLine.nextInt();
    		
    		if (OPTION == 5) break;
    		
    		else if (OPTION == 0) {
    			ManageAccount.ShowAllAccounts();
    		}
    		
    		else if (OPTION == 1) {
	    		
    			String login = readLine.next(), password = readLine.next(), nickname = readLine.next();
	        	ManageAccount.CreateAccount(login, password, nickname);	
    		}
    		
    		else if (OPTION == 2) {
    			
    		}
    		
    		else if (OPTION == 3) {
    			String accountToRemove = readLine.next();
    			ManageAccount.RemoveAccount(accountToRemove);
    		}
    		
    		
    	}
    }

}

