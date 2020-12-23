package MPH.bakend.MPH.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ejemplo")
public class EjemploController {
	public static final String EXAMPLEVIEW= "ejemplo";
	//Primera forma de llamada
	@GetMapping("/ejemploString")
	public String ejemploString( ) {
	return "ejemplo";
	}
	//segunda Forma de llamada
	@GetMapping("/ejemplomMAV")
	public ModelAndView ejemploMAV() {
	return new ModelAndView("ejemplo");
	}
}
