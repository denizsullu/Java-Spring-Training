package throwDemo;

public class EmptException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;

	public EmptException(String string) {
		super();
		this.string = string;
	}
	@Override
	public String getMessage() {
		
		return this.string;
	}
}
