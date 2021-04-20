package com.neu.foodorder.entity;

public class User {
	private Integer userid;
	private String username;
	private String password;
	private String regtime;
	private String pic;
	private Integer guguid;
	private  Integer teamid;
	private  String motto;
	private  String target;


	public User(Integer userid, String username, String password, String regtime, String pic, Integer guguid, Integer teamid, String motto, String target) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.regtime = regtime;
		this.pic = pic;
		this.guguid = guguid;
		this.teamid = teamid;
		this.motto = motto;
		this.target = target;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getGuguid() {
		return guguid;
	}

	public void setGuguid(Integer guguid) {
		this.guguid = guguid;
	}

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "User{" +
				"userid=" + userid +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", regtime='" + regtime + '\'' +
				", pic='" + pic + '\'' +
				", guguid=" + guguid +
				", teamid=" + teamid +
				", motto='" + motto + '\'' +
				", target='" + target + '\'' +
				'}';
	}

	public User() {
		super();
	}
	
	
}
	
