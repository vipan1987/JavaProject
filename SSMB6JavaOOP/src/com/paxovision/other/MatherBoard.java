package com.paxovision.other;

public class MatherBoard {
	
	private String name;
	private String msg;
	
	public MatherBoard() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MatherBoard [name=" + name + ", msg=" + msg + "]";
	}
	
	

}
