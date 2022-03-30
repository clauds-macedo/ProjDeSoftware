package manageAcc;
import java.util.*;


public class ManageAccount {
	
	static List<List<String>> USER_ACCOUNTS = new ArrayList<List<String>>();
	static List<List<String>> USER_ACCOUNTS_INFO = new ArrayList<List<String>>();
	
	public static List<List<String>> CreateAccount(String login, String password, String nickname) {
		
		String[] account = {login, password, nickname};
		
		USER_ACCOUNTS.add(Arrays.asList(account));
		System.out.println(USER_ACCOUNTS);
		
		return USER_ACCOUNTS;
		
	}
	
	public static void ShowAllAccounts(){
		System.out.println(USER_ACCOUNTS);
	}
	
	public static void EditAccountInfo(String account_id, String petName, String musicalStyle) {
		
		String[] accountInfo = {account_id, petName, musicalStyle};
		USER_ACCOUNTS_INFO.add(Arrays.asList(accountInfo));
		
		System.out.println(USER_ACCOUNTS_INFO);
		
	}
	
	public static void RemoveAccount(String user_login) {
		Iterator<List<String>> USER_ACCOUNT = USER_ACCOUNTS.iterator();
		while (USER_ACCOUNT.hasNext()) {
			List<String> ACC = USER_ACCOUNT.next();
			if (ACC.contains(user_login)) {
				USER_ACCOUNT.remove();
			}
		}
	}
	
}



