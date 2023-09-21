package in.shashimodel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String saddress;
	private Integer sage;
	
	static {
		System.out.println("Class loading successful");
	}
	public Student() {
		System.out.println("Getting in side Student class");
	}
	public void setSid(Integer sid) {
		this.sid=sid;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public void setSaddress(String saddress) {
		this.saddress=saddress;
	}
	public void setSage(Integer sage) {
		this.sage=sage;
	}
	public Integer getSid() {return sid;}
	public Integer getSage() {return sage;}
	public String getSname() {return sname;}
	public String getSaddress() {return saddress;}
	
	@Override
	public String toString() {
		return "{" + sid+","+ sname+","+ saddress +","+ sage+"}";
		
	}
	
}
