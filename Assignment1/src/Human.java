
public abstract class Human {
	private int age;
	private String name;
	private String status;
	private String gender;
	
	public Human(int accAge, String accName, String accStatus, String accGender) {
		age = accAge;
		name = accName;
		status = accStatus;
		gender = accGender;
	}
	
	public void setAge() {}
	public void setName() {}
	public void setStatus() {}
	public void setGender() {}
	public int getAge() {return age;}
	public String getName() {return name;}
	public String getStatus() {return status;}
	public String getGender() {return gender;}
	
	protected abstract void addParent(Adult adult);
}
