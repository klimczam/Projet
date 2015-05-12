package fr.iut.valence.exceptions;

public class InvalidExceptions extends Exception {
	
	/**
	 * exception
	 */
	public InvalidExceptions() {
		super();
	}
	/** 
	 * constructor exception
	 * @param message
	 */
	public InvalidExceptions(String message) {
		super(message);
	}
	/**
	 * constructor with settings 
	 * @param message
	 * @param t
	 */
	public InvalidExceptions(String message, Throwable t) {
		super(message, t);
	}
}
