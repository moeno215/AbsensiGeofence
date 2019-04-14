package com.google.android.gms.location.sample.geofencing.respon_login.responnse_read;

import com.google.gson.annotations.SerializedName;

public class ResponseRead{

	@SerializedName("stats")
	private String stats;

	@SerializedName("tanggal")
	private String tanggal;

	@SerializedName("user")
	private String user;

	public void setStats(String stats){
		this.stats = stats;
	}

	public String getStats(){
		return stats;
	}

	public void setTanggal(String tanggal){
		this.tanggal = tanggal;
	}

	public String getTanggal(){
		return tanggal;
	}

	public void setUser(String user){
		this.user = user;
	}

	public String getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"ResponseRead{" + 
			"stats = '" + stats + '\'' + 
			",tanggal = '" + tanggal + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}