import java.util.List;

public class APIClient {

	/**
	 * 
	 * @param accountNumber
	 * @param Last4SSN
	 */
	public boolean checkCustomerAccount(int accountNumber, int Last4SSN) {
		// TODO - implement APIClient.checkCustomerAccount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 */
	public List<AccountSummary> getAllAccountsForCustomer(int customerID) {
		// TODO - implement APIClient.getAllAccountsForCustomer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param accountNumber
	 * @param DeliveryPreference
	 */
	public void syncDeliveryPreferences(int accountNumber, String DeliveryPreference) {
		// TODO - implement APIClient.syncDeliveryPreferences
		throw new UnsupportedOperationException();
	}

	/**
	 * This will actually return a pdf, docx, opd, etc. 'Object' will need to be
	 * replaced once we know what we are getting back from the bank's api
	 * 
	 * @param accountNumber
	 * @param Last4SSN
	 */
	public Object getDocumentByAccount(int accountNumber, int Last4SSN) {
		// TODO - implement APIClient.getDocumentByAccount
		throw new UnsupportedOperationException();
	}

}