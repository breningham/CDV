package it.eng.opsi.cdv.accountmanager.model;

public class AccountAlreadyPresentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountAlreadyPresentException(String message) {
		super(message);
	};

}
