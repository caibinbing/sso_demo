package com.caibinbing.bo;

/**
 * 用户
 * @author zhuguodong
 */
public class UserBo extends BaseBo {
	private Integer id;
	private String name;
	private String phone;
	private String wxId;
	private String jobTitle;
	private String dept;
	private String deptlevelinfo;
	private String regionName;
		
	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getDeptlevelinfo() {
		return deptlevelinfo;
	}

	public void setDeptlevelinfo(String deptlevelinfo) {
		this.deptlevelinfo = deptlevelinfo;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

}
