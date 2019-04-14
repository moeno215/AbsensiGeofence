package com.google.android.gms.location.sample.geofencing.respon_login.response_create;

import com.google.gson.annotations.SerializedName;

public class ResponseCreate{

	@SerializedName("stats")
	private String stats;

	@SerializedName("message")
	private String message;

	@SerializedName("user")
	private String user;

	@SerializedName("status")
	private String status;

	public void setStats(String stats){
		this.stats = stats;
	}

	public String getStats(){
		return stats;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setUser(String user){
		this.user = user;
	}

	public String getUser(){
		return user;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseCreate{" + 
			"stats = '" + stats + '\'' + 
			",message = '" + message + '\'' + 
			",user = '" + user + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}