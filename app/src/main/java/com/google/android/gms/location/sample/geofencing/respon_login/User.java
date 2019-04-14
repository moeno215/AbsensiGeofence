package com.google.android.gms.location.sample.geofencing.respon_login;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("nama")
	private String nama;

	@SerializedName("edtpassword")
	private String edtpassword;

	@SerializedName("id")
	private String id;

	@SerializedName("edtusername")
	private String edtusername;

	@SerializedName("levl")
	private String levl;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setEdtpassword(String edtpassword){
		this.edtpassword = edtpassword;
	}

	public String getEdtpassword(){
		return edtpassword;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setEdtusername(String edtusername){
		this.edtusername = edtusername;
	}

	public String getEdtusername(){
		return edtusername;
	}

	public void setLevl(String levl){
		this.levl = levl;
	}

	public String getLevl(){
		return levl;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"nama = '" + nama + '\'' + 
			",edtpassword = '" + edtpassword + '\'' + 
			",id = '" + id + '\'' + 
			",edtusername = '" + edtusername + '\'' + 
			",levl = '" + levl + '\'' + 
			"}";
		}
}