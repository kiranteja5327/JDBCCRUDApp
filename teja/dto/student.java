package in.teja.dto;

import java.io.Serializable;

public class student implements Serializable {
      private Integer sid;
      private String sname;
      private Integer sage;
      private String saddress;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getsAge() {
		return sage;
	}
	public void setsAge(Integer age) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString()
	{
		return "student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
      
}
