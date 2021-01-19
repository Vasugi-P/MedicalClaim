package com.insurance.hcis.exception;

/**
 * @author Manisha Yadav
 * Description- exception class to handle null inputs.
 *
 */
public class InvalidInputs extends Exception {

	private static final long serialVersionUID = 1L;
	public InvalidInputs(String message)
	{
		super(message);
	}
}
