package BankProject;

public class AdharCard {
	private String name;
	private String address;
	private String dob;
	private String adharnumber;

	public AdharCard(String name, String address, String dob, String adharnumber) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.adharnumber = adharnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(String adharnumber) {
		this.adharnumber = adharnumber;
	}

	@Override
	public String toString() {
		return "AdharCard [name=" + name + ", address=" + address + ", dob=" + dob + ", adharnumber=" + adharnumber
				+ "]";
	}

}
