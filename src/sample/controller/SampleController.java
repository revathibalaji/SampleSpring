package sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	private static final Logger LOGGER = Logger.getLogger(SampleController.class);

	@RequestMapping(value = "/")
	public ModelAndView getLoginCount(HttpServletRequest request) {

		return new ModelAndView("index");
	}

}
