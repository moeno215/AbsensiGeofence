package com.google.android.gms.location.sample.geofencing.respon_login;


import com.google.gson.annotations.SerializedName;

public class ResponseLogin{

	@SerializedName("result")
	private String result;

	@SerializedName("msg")
	private String msg;

	@SerializedName("user")
	private User user;

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return result;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"ResponseLogin{" + 
			"result = '" + result + '\'' + 
			",msg = '" + msg + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}