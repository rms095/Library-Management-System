/**
 * 
 */
package com.sunbeam.app.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sunbeam.app.model.User;
import com.sunbeam.app.service.RoleService;
import com.sunbeam.app.service.UserService;

/**
 * @author mored
 *
 */

@Controller
@Scope("session")
public class LoginActivitiesController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	// Get your Login Page
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getloginPage() {
		return "login";
	}

	// User Authentication & Redirect to respective page
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			RedirectAttributes model, HttpServletRequest request) {

		User user = userService.getUserByUsername(username);

		if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
			if (user.isActStatus()) {
				model.addFlashAttribute("user", user);
				switch (user.getRole().getRole_name()) {
				case "admin":
					return "redirect:/admin";
				case "librarian":
					return "redirect:/librarian";
				default:
					return "redirect:/student";
				}
			} else {
				model.addFlashAttribute("error", "Account is not activated yet. contact to Admin");
				return "redirect:/login";
			}
		} else {
			model.addFlashAttribute("error", "Invalid username and password");
			return "redirect:/login";
		}
	}

	// Get Registration Page
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String getRegistrationPage() {
		return "registration";
	}

	// Add new user
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String addUser(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("mobileNo") String mobileNo, @RequestParam("role") String roleName) {

		userService.addUser(User.create(username, password, mobileNo, roleService.getRoleByName(roleName)));
		return "redirect:/registration";
	}

	// Get Forgot Password Page
	@RequestMapping(value = "/forgotpassword", method = RequestMethod.GET)
	public String getForgotPage() {
		System.out.println("inside GET");
		return "forgotPassword";
	}

	// Change Forgot Password Page
	@RequestMapping(value = "/forgotpassword", method = RequestMethod.POST)
	public String forgotPassword(@RequestParam("username") String username, RedirectAttributes model) {
		User user = userService.getUserByUsername(username);
		if (user != null) {
			user.setPassword(UUID.randomUUID().toString());
			userService.updateUser(user);
			model.addFlashAttribute("result", "Password Reseted, Kindly check your email");
			System.out.println("inside true");
			return "redirect:/forgotpassword";
		} else {
			System.out.println("inside false");
			model.addFlashAttribute("result", "Invalid username. Kindly check it once");
			return "redirect:/forgotpassword";
		}
	}

	// change Password Page
	@RequestMapping(value = "/changepassword", method = RequestMethod.GET)
	public String getChangePasswordPage() {
		System.out.println("inside GET Change Password");
		return "changepassword";
	}

	// Change Password Page
	@RequestMapping(value = "/changepassword", method = RequestMethod.POST)
	public String changePassword(@RequestParam("username") String username, @RequestParam("password") String password,
			@RequestParam("cofirmpassword") String confirmPassword, RedirectAttributes model) {
		System.out.println("inside cP " + confirmPassword + "   -   " + password);
		User user = userService.getUserByUsername(username);
		if (user != null && password.equals(confirmPassword)) {
			user.setPassword(password);
			userService.updateUser(user);
			return "redirect:/login";
		} else {
			model.addFlashAttribute("result", "password not matching");
			model.addFlashAttribute("username", user.getUsername());
			return "redirect:/changepassword";
		}
	}

	// Redirected to Admin Page
	@RequestMapping(value = "/admin")
	public String getAdminPage() {
		return "admin";
	}

	// Redirected to Librarian Page
	@RequestMapping(value = "/librarian")
	public String getLibrarianPage() {
		return "librarian";
	}

	// Redirected to Student Page
	@RequestMapping(value = "/student")
	public String getStudenPage() {
		return "student";
	}
}
