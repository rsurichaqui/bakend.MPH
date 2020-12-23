package MPH.bakend.MPH.Componente;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import MPH.bakend.MPH.Repository.CursoJPARepository;

@Component("ejemploComponente")
public class EjemploComponente {
	private static final Log LOG = LogFactory.getLog(EjemploComponente.class);
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJPARepository cursoJpaRepository;
	
	public void diceHola() {
	LOG.info("Hola desde el Componente Ejemplo");
	}
}
