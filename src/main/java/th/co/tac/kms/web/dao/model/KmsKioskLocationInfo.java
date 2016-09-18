package th.co.tac.kms.web.dao.model;

public class KmsKioskLocationInfo {
	// kms_kiosk_location_info.remark_address

	private Integer locationTypeId;
	private String otherLocation;
	private String kioskAddress;
	private String moo;
	private String soi;
	private String road;
	private Integer provinceId;
	private Integer districtId;
	private Integer tambonId;
	private Integer postalCode;
	private String remarkAddress;

	public Integer getLocationTypeId() {
		return locationTypeId;
	}

	public void setLocationTypeId(Integer locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	public String getOtherLocation() {
		return otherLocation;
	}

	public void setOtherLocation(String otherLocation) {
		this.otherLocation = otherLocation;
	}

	public String getKioskAddress() {
		return kioskAddress;
	}

	public void setKioskAddress(String kioskAddress) {
		this.kioskAddress = kioskAddress;
	}

	public String getMoo() {
		return moo;
	}

	public void setMoo(String moo) {
		this.moo = moo;
	}

	public String getSoi() {
		return soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getTambonId() {
		return tambonId;
	}

	public void setTambonId(Integer tambonId) {
		this.tambonId = tambonId;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getRemarkAddress() {
		return remarkAddress;
	}

	public void setRemarkAddress(String remarkAddress) {
		this.remarkAddress = remarkAddress;
	}

}
