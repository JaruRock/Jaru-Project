package th.co.tac.kms.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.dao.model.KioskProfile;
import th.co.tac.kms.web.dao.model.KioskProfileSearchCriterion;
import th.co.tac.kms.web.service.KioskProfileService;


@Controller
@RequestMapping("/")
public class KioskProfileController  extends AbstractController{
	
	@Autowired KioskProfileService kioskprofileservice;
	
	@RequestMapping(value = { "/edit-kiosk-search" }, method = RequestMethod.GET)
	public String searchKioskaProfile(  ModelMap model) {
		List <KioskProfile> kioskprofile = new ArrayList<KioskProfile>();
		//kioskprofile = kioskprofileservice.kioskProfileSearch(kiosk);
		model.addAttribute("kiosk",new KioskProfileSearchCriterion() );
		return "edit.kiosk.profile";
	}
	
	@RequestMapping(value = { "/edit-kiosk-search" }, method = RequestMethod.GET)
	public String searchKioskaProfileSearch(  ModelMap model) {
		List <KioskProfile> kioskprofile = new ArrayList<KioskProfile>();
		//kioskprofile = kioskprofileservice.kioskProfileSearch(kiosk);
		model.addAttribute("kiosk",new KioskProfileSearchCriterion() );
		return "edit.kiosk.profile";
	}
	

	

	
}
