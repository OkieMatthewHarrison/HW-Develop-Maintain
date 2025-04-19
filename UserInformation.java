import java.util.List;

public class UserInformation {

	private int userID;
	private String userName;
	private String password;
	private int last4SSN;
	private UserEngagement userEngagement;
	private List<AccountSummary> accounts;

	/**
	 * 
	 * @param input
	 */
	public boolean checkPassword(String input) {
		// TODO - implement UserInformation.checkPassword
		throw new UnsupportedOperationException();
	}

	public String getUserName() {
		return this.userName;
	}

	public int getLast4SSNForAPI() {
		// TODO - implement UserInformation.getLast4SSNForAPI
		throw new UnsupportedOperationException();
	}

	public Boolean getPaperless() {
		// TODO - implement UserInformation.getPaperless
		throw new UnsupportedOperationException();
	}

}