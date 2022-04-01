package excepciones;

@SuppressWarnings("serial")
public class negativeInput extends Exception {
	public negativeInput (String errorMessage) {
		super(errorMessage);
	}
}
