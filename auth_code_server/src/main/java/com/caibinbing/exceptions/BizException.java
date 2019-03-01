package com.caibinbing.exceptions;




public class BizException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1417009976571509529L;
	protected long errorCode;
	protected String errorMsg;

	public BizException(Throwable e) {
		super(e);
	}

	public BizException(long errorCode, String msg) {
		super("ErrorCode:" + errorCode + ";ErrorMsg:" + msg);
		this.errorCode = errorCode;
		this.errorMsg = msg;
	}

	public BizException(long errorCode, String msg, Throwable e) {
		super("ErrorCode:" + errorCode + ";ErrorMsg:" + msg, e);
		this.errorCode = errorCode;
		this.errorMsg = msg;
	}

	public BizException(ErrorCode errorCode) {
		super("ErrorCode:" + errorCode.getErrorCode() + ";ErrorMsg:" + errorCode.getErrorMsg());
		//super("ErrorCode:" + errorCode);
		this.errorCode = errorCode.getErrorCode();
		this.errorMsg = errorCode.getErrorMsg();
	}

	public BizException(ErrorCode errorCode, Throwable e) {
		super("ErrorCode:" + errorCode, e);
		this.errorCode = errorCode.getErrorCode();
		this.errorMsg = errorCode.getErrorMsg();
	}

	public BizException(ErrorCode errorCode, String errmsg) {
		super("ErrorCode:" + errorCode.getErrorCode() + ";ErrorMsg:"
				+ errorCode.getErrorMsg() + ";" + errmsg);
		this.errorCode = errorCode.getErrorCode();
		this.errorMsg = errorCode.getErrorMsg() + ";" + errmsg;
	}

	public BizException(ErrorCode errorCode, String errmsg, Throwable e) {
		super("ErrorCode:" + errorCode.getErrorCode() + ";ErrorMsg:"
				+ errorCode.getErrorMsg() + ";" + errmsg, e);
		this.errorCode = errorCode.getErrorCode();
		this.errorMsg = errorCode.getErrorMsg() + ";" + errmsg;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
