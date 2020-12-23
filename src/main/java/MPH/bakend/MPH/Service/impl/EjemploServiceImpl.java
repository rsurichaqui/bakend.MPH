package MPH.bakend.MPH.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import MPH.bakend.MPH.Model.Persona;
import MPH.bakend.MPH.Service.EjemploServiceI;

@Service("ejemploService")
public class EjemploServiceImpl implements EjemploServiceI {
	private static final Log LOG = LogFactory.getLog(EjemploServiceImpl.class);
	@Override
	public List<Persona> getListGente() {
	// TODO Auto-generated method stub
	List<Persona> gente= new ArrayList<>();
	gente.add(new Persona("Joe",47));
	gente.add(new Persona("Julio",45));
	gente.add(new Persona("Aldo",40));
	gente.add(new Persona("Raul",42));
	LOG.info("Hola desde el servicio");
	return gente;
	}
}

