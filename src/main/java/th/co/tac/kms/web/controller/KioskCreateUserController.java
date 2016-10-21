package th.co.tac.kms.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KioskCreateUserController extends AbstractController{

	@RequestMapping(value = { "/create-user" }, method = RequestMethod.GET)
	public String init() {
		return "create.user";
	}
}
