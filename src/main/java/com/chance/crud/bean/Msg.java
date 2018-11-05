package com.chance.crud.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {

	private int code;
	private String msg;
	
	private Map<String,Object> extend = new HashMap<String,Object>();

	public static Msg success() {
		Msg msg = new Msg();
		msg.setCode(100);
		msg.setMsg("成功");
		return msg;
	}
	
	public static Msg shibai() {
		Msg msg1 = new Msg();
		msg1.setCode(200);
		msg1.setMsg("失败");
		return msg1;
	}
	
	public Msg add(String key,Object value) {
		
		this.getExtend().put(key, value);
		return this;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
