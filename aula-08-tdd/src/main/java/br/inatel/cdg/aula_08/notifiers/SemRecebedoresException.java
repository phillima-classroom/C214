package br.inatel.cdg.aula_08.notifiers;

public class SemRecebedoresException extends RuntimeException {

	public SemRecebedoresException() {
		super();
	}

	public SemRecebedoresException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SemRecebedoresException(String message, Throwable cause) {
		super(message, cause);
	}

	public SemRecebedoresException(String message) {
		super(message);
	}

	public SemRecebedoresException(Throwable cause) {
		super(cause);
	}
	
}