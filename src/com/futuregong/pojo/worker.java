package com.futuregong.pojo;

public class worker {
	
	private String name;
	private int telephone;
	private String work;
	private int qq;
	private String weixin;
	private String company;
	public worker(String name, int telephone, String work, int qq,
			String weixin, String company) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.work = work;
		this.qq = qq;
		this.weixin = weixin;
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
