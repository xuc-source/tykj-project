package com.mock.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private ErrorCode errorCode;

	public CommonException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

	public CommonException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public int getCode() {
		return errorCode.getCode();
	}

	public String getMessage() {
		return super.getMessage();
	}
}
