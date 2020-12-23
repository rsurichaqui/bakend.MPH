package MPH.bakend.MPH.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import MPH.bakend.MPH.Componente.EjemploComponente;
import MPH.bakend.MPH.Model.Persona;
import MPH.bakend.MPH.Service.EjemploServiceI;

@Controller
@RequestMapping("/api")
public class HolamphController {
	//Muestra mensaje en consola de ejecucion del Spring tool
	@Autowired
	@Qualifier("ejemploComponente")
	private EjemploComponente ejemploComponente;
	
	@Autowired
	@Qualifier("ejemploService")
	private EjemploServiceI ejemploService;
	
	@GetMapping("/holamph")
	public String holaMph(Model model) {
		model.addAttribute("persona",new Persona("Raul",43));
		ejemploComponente.diceHola();
		//model.addAttribute("persona",new Persona("Joe",47));
		//model.addAttribute("gente",getGente());
		model.addAttribute("gente",ejemploService.getListGente());
	return "holamph.html";
	}
}
