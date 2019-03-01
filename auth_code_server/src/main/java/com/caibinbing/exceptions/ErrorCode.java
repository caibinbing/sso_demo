/**
 * 
 */
package com.caibinbing.exceptions;

/**
 * 客户端错误：4000开始
 * 服务器错误：5000开头
 * @author zhuguodong
 *
 */
public enum ErrorCode {
	USER_NOT_LOGIN(4000, "用户未登录"),
	TOKEN_EXPIRE_ERROR(4001, "登录超期了，请重新登录"),
	TOKEN_ILLEGAL_ERROR(4001, "Token错误，请重新登录"),
	INVAID_LOGIN(4003, "登录失败，请重新登录"),
	INVAID_PASSWORD(4004, "账号或密码错误"),
	
	/**移动端根据4005状态码提示的信息如下：*/
	/*非本公司在职员工，有问题请联系信息部处理
	 */
	NOT_EMPLOYEE_ERROR(4005,"非本公司在职员工，不能注册。\r\n本号码与OA系统的手机号码不匹配，请联系区域HR或督导修改，次日生效。\r\n PS：还有问题，请联系信息部。"),
	OPERATE_FAIL(4006,"操作失败"),
	
	UNREGISTE(4010, "用户未注册"),		
	REGISTE_REPEAT(4011, "重复注册，手机号或微信号已存在。PS：请联系信息部"),/*重复注册，手机号或微信号已存在*/
	REGISTE_FAIL(4012, "注册失败，请重新注册"),
	VERIFYCODE_FAIL(4013, "验证码错误!"),

	NOT_EXIST(4020, "资料不存在或已删除"),
	PERMISSION_DENIED(4021, "您没有权限进行该操作"),
	PARAM_ERROR(4022, "参数错误"),	
	JOIN_BUCKET_FAIL(4023, "空间名或邀请码错误"),
	REPEAT_JOIN_BUCKET(4024, "您已经加入该空间了"),
	ADD_POS_NUM(4025, "请录入POS单号"),
	NOT_ACTIVITY_USER(4026, "抱歉，此回馈活动仅限特定顾客参与，尚未对您开放！"),
	FIX_REPEAT(4027, "已预定了其它礼品"),
	EVENT_NOT_ONLINE(4028, "本次活动暂未开始,请敬请期待"),
	EVENT_END_ONLINE(4029, "本次活动已结束"),
	GET_COUPON(4030, "您已领取优惠卷"),
	
	SERVER_UNKNOW_ERROR(5000, "服务器内部错误,未知错误"),
	PUSH_SERVER_ERROR(5001, "推送服务器异常"),
	ADMIN_NOT_LOGIN(5002, "管理员未登录"),
	USER_NOT_EXIST(5003, "用户不存在"),
	WX_MD_FAILURE(5004, "Md5校验失败"),
	THIRD_SYSTEM_ERROR(5005, "第三方系统错误，请稍候重试"),
	GET_MOBILE_REPORT_TOKEN_ERROR(5006, "获取mobileReport平台token失败"),
	MOBILE_REPORT_SERVER_ERROR(5007, "mobileReport平台服务异常"),
	
	UNKNOWN_ERROR_CODE(5999, "未知错误"),
	;
	
	private long errcode;
	private String errmsg;

	private ErrorCode(long errorCode, String errorMsg) {
		this.errcode = errorCode;
		this.errmsg = errorMsg;
	}

	public long getErrorCode() {
		return errcode;
	}

	public String getErrorMsg() {
		return errmsg;
	}

	public static ErrorCode getByCode(long errorcode) {
		for (ErrorCode err : ErrorCode.values()) {
			if (err.getErrorCode() == errorcode) {
				return err;
			}
		}
		return UNKNOWN_ERROR_CODE;
	}

	@Override
	public String toString() {
		return "ErrorCode:" + errcode + ";ErrorMessage:" + errmsg;
	}

}
