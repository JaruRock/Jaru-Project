package th.co.tac.kms.web.controller.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class MachineInfo implements Serializable {
 
	private static final long serialVersionUID = -1762662409208198049L;
	
	/*
  machine_id integer NOT NULL DEFAULT nextval('kms_kiosk_machine_info_seq'::regclass),
  kiosk_id character varying(45),
  ref_kiosk_id character varying(45),
  wallet_id character varying(45),
  location_id integer,
  kiosk_status character varying(45), -- A = Active, I = InActive
  project_code character varying(45),
  sim_card_id integer,
  kiosk_serial_no text,
  renter_id integer,
  vendor_id integer,
  registed_date timestamp(6) without time zone,
  activate_date timestamp without time zone,
  created_by character varying(45),
  created_date timestamp(6) without time zone,
  updated_by character varying(45),
  updated_date timestamp(6) without time zone,
	 */
	
	
	private Integer machineId;
	private Integer kioskId;
	private Integer refKioskId;
	private Integer walletId;
	private Integer locationId;
	private String kioskStatus;
	private String projectCode;
	private Integer simCardId;
	private String kioskSerialNo;
	private Integer renterId;
	private Integer vendorId;
	private Timestamp registedDate;
	private Timestamp activateDate;
	private String createBy;
	private Timestamp createDate;
	private String updateBy;
	private Timestamp updateDate;
	public Integer getMachineId() {
		return machineId;
	}
	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}
	public Integer getKioskId() {
		return kioskId;
	}
	public void setKioskId(Integer kioskId) {
		this.kioskId = kioskId;
	}
	public Integer getRefKioskId() {
		return refKioskId;
	}
	public void setRefKioskId(Integer refKioskId) {
		this.refKioskId = refKioskId;
	}
	public Integer getWalletId() {
		return walletId;
	}
	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getKioskStatus() {
		return kioskStatus;
	}
	public void setKioskStatus(String kioskStatus) {
		this.kioskStatus = kioskStatus;
	}
	public String getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	public Integer getSimCardId() {
		return simCardId;
	}
	public void setSimCardId(Integer simCardId) {
		this.simCardId = simCardId;
	}
	public String getKioskSerialNo() {
		return kioskSerialNo;
	}
	public void setKioskSerialNo(String kioskSerialNo) {
		this.kioskSerialNo = kioskSerialNo;
	}
	public Integer getRenterId() {
		return renterId;
	}
	public void setRenterId(Integer renterId) {
		this.renterId = renterId;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public Timestamp getRegistedDate() {
		return registedDate;
	}
	public void setRegistedDate(Timestamp registedDate) {
		this.registedDate = registedDate;
	}
	public Timestamp getActivateDate() {
		return activateDate;
	}
	public void setActivateDate(Timestamp activateDate) {
		this.activateDate = activateDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
 
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	
	 

}
