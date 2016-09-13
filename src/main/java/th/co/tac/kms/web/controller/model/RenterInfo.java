package th.co.tac.kms.web.controller.model;

public class RenterInfo {
 
	private Long renterId;
	private String firstName;
	private String lastName;
	private String contactNumber;
	public Long getRenterId() {
		return renterId;
	}
	public void setRenterId(Long renterId) {
		this.renterId = renterId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
