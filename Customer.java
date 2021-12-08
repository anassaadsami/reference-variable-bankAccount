package AccountWithRerferncVariable;

public class Customer {
	private String name;
	private int age ;
	private String phoneNum;
	boolean isMerreid;
//	Customer friend ;       // reference variable as a instance variable
	
	public Customer(String name , int age , String phoneNum , boolean isMerreid) {
		setName(name);
		setAge(age);
		setPhoneNum(phoneNum);
		this.isMerreid = isMerreid;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	

}
