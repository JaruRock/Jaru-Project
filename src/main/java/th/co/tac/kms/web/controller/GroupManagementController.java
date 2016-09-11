package th.co.tac.kms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.GroupInfo;
import th.co.tac.kms.web.service.GroupService;

@Controller
@RequestMapping("/")
//@SessionAttributes("groupTypeList")
public class GroupManagementController extends AbstractWebController {

	@Autowired
	private GroupService groupService;
	
	@ModelAttribute("navClassActiveAdmin")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@ModelAttribute("loggedinuser")
	public String loginedUser() {
		return getPrincipal(); // TODO: register user login session
	}
	
	@RequestMapping(value = { "/group-list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<GroupInfo> groupList = groupService.findAll();
		model.addAttribute("groupList", groupList);
		return "group.list";
	}

}
