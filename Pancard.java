package BankProject;

public class Pancard {
	String name;
	String dob;
	@Override
	public String toString() {
		return "Pancard [name=" + name + ", dob=" + dob + ", panNumber=" + panNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public Pancard(String name, String dob, String panNumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.panNumber = panNumber;
	}

	String panNumber;

}
