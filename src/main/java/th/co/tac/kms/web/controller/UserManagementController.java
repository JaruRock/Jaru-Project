package th.co.tac.kms.web.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import th.co.tac.kms.web.controller.model.UserInfo;
import th.co.tac.kms.web.service.UserService;

@Controller
@RequestMapping("/")
public class UserManagementController extends AbstractController {

	@Autowired
	private UserService userService;

	@Autowired
	private MessageSource messageSource;

	@ModelAttribute("navClassActiveAdmin")
	public String menuActive() {
		return "active"; // TODO: active navigate menu
	}
	
	@ModelAttribute("loggedinuser")
	public String loginedUser() {
		return getPrincipal(); // TODO: register user login session
	}
	
	@RequestMapping(value = { "/user-list" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<UserInfo> userList = userService.findAllUsers();
		model.addAttribute("userList", userList);
		return "user.list";
	}

	@RequestMapping(value = { "/new-user" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		model.addAttribute("user", new UserInfo());
		model.addAttribute("edit", false);
		return "user.register";
	}

	@RequestMapping(value = { "/new-user" }, method = RequestMethod.POST)
	public String saveUser(@Valid UserInfo user, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "user.register";
		}
		
		if (!userService.isUsernameUnique(user.getUserId(), user.getUsername())) {
			String[] errorParams = { user.getUsername() };
			String nonUniqueUserError = messageSource.getMessage("non.unique.username", errorParams, Locale.getDefault());
			FieldError usernameError = new FieldError("user", "username", nonUniqueUserError);
			result.addError(usernameError);
			model.addAttribute("user", user);
			return "user.register";
		}

		userService.saveUser(user);

		String successMesg = "User " + user.getFirstName() + " " + user.getLastName() + " registered successfully";
		model.addAttribute("success", successMesg);
		return "user.register.success";
	}

	@RequestMapping(value = { "/edit-user-{username}" }, method = RequestMethod.GET)
	public String editUser(@PathVariable String username, ModelMap model) {
		UserInfo user = userService.findByUsername(username);
		model.addAttribute("user", user);
		model.addAttribute("edit", true);
		return "user.register";
	}

	@RequestMapping(value = { "/edit-user-{username}" }, method = RequestMethod.POST)
	public String updateUser(@Valid UserInfo user, BindingResult result, ModelMap model, @PathVariable String username) {

		if (result.hasErrors()) {
			return "user.register";
		}

		userService.updateUser(user);

		String successMesg = "User " + user.getFirstName() + " " + user.getLastName() + " updated successfully";
		model.addAttribute("success", successMesg);
		return "user.register.success";
	}

	@RequestMapping(value = { "/delete-user-{username}" }, method = RequestMethod.GET)
	public String deleteUser(@PathVariable String username) {
		userService.deleteUserByUsername(username);
		return "redirect:/user-list";
	}

}
