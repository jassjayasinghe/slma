package jas.el.sms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jas.el.sms.model.User;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getRegisterForm(ModelMap model){
		 User user = new User();
	     model.addAttribute("user", user);
	        return "addUserForm";
	}
	
    @RequestMapping(method = RequestMethod.POST)
    public String saveRegistration(@Valid User user, BindingResult result, ModelMap model){
 
        if(result.hasErrors()) {
                return "addUserForm";
        }
 
        model.addAttribute("msg", "Dear "+ user.getInitials()+" , your Registration completed successfully");
        return "success";
    }
	

}
