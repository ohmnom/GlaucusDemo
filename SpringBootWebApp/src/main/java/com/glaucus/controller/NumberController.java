package com.glaucus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glaucus.model.NumberIncrement;
import com.glaucus.service.INumberService;

/**
 * 
 * @author Himanshu Arya
 *
 */
@Controller
public class NumberController implements ErrorController {
	
	@Autowired
	private INumberService numberService;
	
	private static final String PATH = "/error";
	private static final String HOME = "/home";
	private static final String ERROR = "Error handling";

    @RequestMapping(value = PATH)
    public String error() {
        return ERROR;
    }
	
    /**
     * @return NumberIncrement Object in json format
     */
    @ResponseBody
	@RequestMapping(value =HOME)	
	public synchronized NumberIncrement incrementNumber() {
		
		NumberIncrement currentNumber = numberService.incrementNumber();
		
		return currentNumber;
		
	}
    
    @Override
    public String getErrorPath() {
        return PATH;
    }

}
