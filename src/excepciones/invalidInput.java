package excepciones;

@SuppressWarnings("serial")
public class invalidInput extends Exception {
	public invalidInput (String errorMessage) {
		super(errorMessage);
	}
}
