package th.co.tac.kms.web.controller.model;

import java.sql.Timestamp;

public class LocationInfo {
 
	
	private Integer locationId;
	private String longitude;
	private String latitude;
	private String kioskAddress;
	private String remarkAddress;
	private String locationStatus;
	//private Region region;
	private String createBy;
	private Timestamp creteDate;
	//private Province province;
	//private District districe;
	//private Tambon tambon;
	 
	public String getLongitude() {
		return longitude;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getKioskAddress() {
		return kioskAddress;
	}
	public void setKioskAddress(String kioskAddress) {
		this.kioskAddress = kioskAddress;
	}
	public String getRemarkAddress() {
		return remarkAddress;
	}
	public void setRemarkAddress(String remarkAddress) {
		this.remarkAddress = remarkAddress;
	}
	public String getLocationStatus() {
		return locationStatus;
	}
	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreteDate() {
		return creteDate;
	}
	public void setCreteDate(Timestamp creteDate) {
		this.creteDate = creteDate;
	}
 

}
