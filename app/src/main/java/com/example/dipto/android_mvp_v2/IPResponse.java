package com.example.dipto.android_mvp_v2;

import com.google.gson.annotations.SerializedName;

public class IPResponse{

	@SerializedName("country")
	private String country;

	@SerializedName("loc")
	private String loc;

	@SerializedName("city")
	private String city;

	@SerializedName("org")
	private String org;

	@SerializedName("ip")
	private String ip;

	@SerializedName("postal")
	private String postal;

	@SerializedName("region")
	private String region;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setLoc(String loc){
		this.loc = loc;
	}

	public String getLoc(){
		return loc;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setOrg(String org){
		this.org = org;
	}

	public String getOrg(){
		return org;
	}

	public void setIp(String ip){
		this.ip = ip;
	}

	public String getIp(){
		return ip;
	}

	public void setPostal(String postal){
		this.postal = postal;
	}

	public String getPostal(){
		return postal;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	@Override
 	public String toString(){
		return 
			"IPResponse{" + 
			"country = '" + country + '\'' + 
			",loc = '" + loc + '\'' + 
			",city = '" + city + '\'' + 
			",org = '" + org + '\'' + 
			",ip = '" + ip + '\'' + 
			",postal = '" + postal + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}