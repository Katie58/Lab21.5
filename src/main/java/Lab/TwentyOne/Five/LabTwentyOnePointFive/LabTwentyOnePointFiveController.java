package Lab.TwentyOne.Five.LabTwentyOnePointFive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LabTwentyOnePointFiveController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/form")
	public ModelAndView mileageForm() {
		ModelAndView mav = new ModelAndView("mileage-form");
		return mav;
	}
	
	@RequestMapping("/result")
	public ModelAndView mileageResult(@RequestParam("mpg") int mpg, @RequestParam("gallons") int gallons) {
		int result = gallons * mpg;
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("mpg", mpg);
		mav.addObject("gallons", gallons);
		mav.addObject("result", result);
		return mav;
	}
	
}
