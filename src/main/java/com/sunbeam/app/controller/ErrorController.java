/**
 * 
 */
package com.sunbeam.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mored
 *
 */

@Controller
public class ErrorController {

	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public String get404(){
		System.out.println("inside 404");
		return "404";
	}

}
