package th.co.tac.kms.web.rest.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/provinces", method = RequestMethod.GET, 
			headers = "Accept=application/json",
			produces = "application/json;charset=UTF-8")
	public String provinces(@RequestParam(value="q", required = false) String q) throws UnsupportedEncodingException {
		return new Gson().toJson(masterLocationService.searchProvinceByProvinceName(q));
	}
	
	@RequestMapping(value = "/{provinceId}/districts", method = RequestMethod.GET, headers = "Accept=application/json")
	public String districts(@PathVariable("provinceId") Integer provinceId) {
		return new Gson().toJson(masterLocationService.getDistricts(provinceId));
	}

	@RequestMapping(value = "/{districtId}/tambons", method = RequestMethod.GET, headers = "Accept=application/json")
	public String tambons(@PathVariable("districtId") Integer districtId) {
		return new Gson().toJson(masterLocationService.getTambons(districtId));
	}
	
}
