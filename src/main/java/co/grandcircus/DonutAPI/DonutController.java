package co.grandcircus.DonutAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonutController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView results() {
		DonutApiResponse response = apiService.getDonuts();
		ModelAndView mv = new ModelAndView("results");
		mv.addObject("donuts", response.getResults());
		return mv;
	}
	
	 @RequestMapping("/details")
	    public ModelAndView details(@RequestParam("id") Long id) {
	        ModelAndView mv = new ModelAndView("details");
	        mv.addObject("donut", apiService.getById(id));
	        return mv;
	    }
	
	

}
