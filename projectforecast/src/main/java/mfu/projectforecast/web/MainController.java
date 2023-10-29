package mfu.projectforecast.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mfu.projectforecast.repository.UserRepository;

@Controller
public class MainController {
	 @Autowired
    private UserRepository userRepository;

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "login";
	}
	
	@GetMapping("/login/weather")
	public String forcast() {
		return "weather_today";
	}
	@GetMapping("/weathertoday")
	public String today(){
		return "weather_today";
	}
}