package th.co.tac.kms.web.rest.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import th.co.tac.kms.web.service.MasterLocationService;

@RestController
public class MasterLocationController extends RestAbstractController {
	
	@Autowired
	MasterLocationService masterLocationService;
	
	@RequestMapping(value = "/provinces", method = RequestMethod.GET 
			, headers = "Accept=application/json"
			, produces = "application/json;charset=UTF-8")
	public String provinces(@RequestParam(value="q", required = false) String q) throws UnsupportedEncodingException {
		return new Gson().toJson(masterLocationService.getProvinceCombobox(q));
	}
	
	@RequestMapping(value = "districts", method = RequestMethod.GET
			, headers = "Accept=application/json"
			, produces = "application/json;charset=UTF-8")
	public String districts(
			@RequestParam(value="q", required = false) String q
			, @RequestParam(value="provinceId") Integer provinceId) {
		return new Gson().toJson(masterLocationService.getDistrictCombobox(q, provinceId));
	}

	@RequestMapping(value = "tambons", method = RequestMethod.GET
			, headers = "Accept=application/json"
			, produces = "application/json;charset=UTF-8")
	public String tambons(
			@RequestParam(value="q", required = false) String q
			, @RequestParam(value="districtId") Integer districtId) {
		return new Gson().toJson(masterLocationService.getTambonCombobox(q, districtId));
	}
	
	@RequestMapping(value = "kioskIds", method = RequestMethod.GET
			, headers = "Accept=application/json"
			, produces = "application/json;charset=UTF-8")
	public String kiosks(
			@RequestParam(value="q", required = false) String q
			, @RequestParam(value="provinceId", required = false) Integer provinceId
			, @RequestParam(value="districtId", required = false) Integer districtId
			, @RequestParam(value="tambonId", required = false) Integer tambonId) {
		return new Gson().toJson(masterLocationService.getKioskIdCombobox(q, provinceId, districtId, tambonId));
	}
}
