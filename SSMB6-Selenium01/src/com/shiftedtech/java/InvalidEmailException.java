package com.shiftedtech.java;

public class InvalidEmailException extends Throwable {
	private static final long serialVersionUID = 1L;

	public InvalidEmailException(String msg) {
		super(msg);
	}
}
