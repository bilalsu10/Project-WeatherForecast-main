package mfu.projectforecast.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import mfu.projectforecast.model.User;
import mfu.projectforecast.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
