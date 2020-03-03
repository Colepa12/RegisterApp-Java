package edu.uark.registerapp.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/employeeDetail")
public class EmployeeDetailRouteController
{
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView start(
        @RequestParam final Map<String, String> queryParameters, 
        final HttpServletRequest request)
    {
        //ADD
    }
    
}
