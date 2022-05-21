package com.fedebuchet.microservices.limitsservice.entity;

public class Limit {

	private Integer minimun;
	private Integer maximun;
	
	
	
	public Limit() {
		super();
	}
	
	public Limit(Integer minimun, Integer maximun) {
		super();
		this.minimun = minimun;
		this.maximun = maximun;
	}
	
	public Integer getMinimun() {
		return minimun;
	}
	public void setMinimun(Integer minimun) {
		this.minimun = minimun;
	}
	public Integer getMaximun() {
		return maximun;
	}
	public void setMaximun(Integer maximun) {
		this.maximun = maximun;
	}
	
	
}
