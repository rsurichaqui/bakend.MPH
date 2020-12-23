package MPH.bakend.MPH.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import MPH.bakend.MPH.Entity.Curso;
import MPH.bakend.MPH.Model.Persona;
import MPH.bakend.MPH.Service.CursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	private static final String CURSOS_VIEW = "cursos";
	@Autowired
	@Qualifier("cursoServicio")
	private CursoService cursoService;
	
	@GetMapping("/listacursos")
	public ModelAndView listAllCursos() {
		ModelAndView mav = new ModelAndView(CURSOS_VIEW);
		mav.addObject("cursos",cursoService.listAllCurso());
		mav.setViewName("cursos.html");
		return mav;
	}
	
	//@GetMapping("/listacursos")
	//public String listAllCursos(Model model) {
	//	//model.addAttribute("curso",new Persona("Raul",43));
	//	//ejemploComponente.diceHola();
	//	model.addAttribute("cursos",cursoService.listAllCurso());
	//	return "cursos.html";
	//}
	
	//@PostMapping("/addcurso")
	//public String addCurso(@ModelAttribute("curso") Curso curso) {
	//	cursoService.addCurso(curso);
	//	return "redirect:/cursos/listacursos";
	//}
}
