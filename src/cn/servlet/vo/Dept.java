package cn.servlet.vo;

import java.io.Serializable;

public class Dept implements Serializable {
	private String dname;
	private Integer deptno;
	private String Loc;
	private Company company;

	public Company getcompany() {
		return company;
	}

	public void setCp(Company company) {
		this.company = company;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
}
