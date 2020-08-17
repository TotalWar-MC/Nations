package tk.totalwar.steffbeard.utils;

public class NationsException extends Exception {
	
	/**
	 * 
	 * No fucking clue why I need this, it auto-genned and I have no idea what it does so w/e
	 * 
	 * @author Steffbeard
	 * 
	 */
	private static final long serialVersionUID = -4294248927241055038L;

	@Deprecated
	public String getError() {

		return getMessage();
	}

	public NationsException() {

		super("unknown");
	}

	public NationsException(String message) {

		super(message);
	}
}
