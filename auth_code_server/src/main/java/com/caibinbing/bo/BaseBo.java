package com.caibinbing.bo;

import java.io.Serializable;
import com.caibinbing.exceptions.ErrorCode;

public class BaseBo implements Serializable{
	private static final long serialVersionUID = 1L;
	private long errcode = 0L;//当且仅当0表示成功，其他是失败
	private String errmsg = "success";
	private int createUser;//创建者
	private String createDate;//创建时间
	private int modifyUser;//修改者
	private String modifyDate;//修改时间

	public BaseBo(){}
	
	public BaseBo(ErrorCode errorCode) {
		this.errcode = errorCode.getErrorCode();
		this.errmsg = errorCode.getErrorMsg();
	}

	public BaseBo(ErrorCode errorCode, String addintionMsg) {
		this.errcode = errorCode.getErrorCode();
		this.errmsg = errorCode.getErrorMsg() + ";" + addintionMsg;
	}

	public BaseBo(long errorCode, String msg) {
		this.errcode = errorCode;
		this.errmsg = msg;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public int getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(int modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public long getErrcode() {
		return errcode;
	}

	public void setErrcode(long errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	

}
