package MPH.bakend.MPH.Service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import MPH.bakend.MPH.Entity.Curso;
import MPH.bakend.MPH.Repository.CursoJPARepository;
import MPH.bakend.MPH.Service.CursoService;

@Service("cursoServicio")
public class CursoServiceImpl implements CursoService {
	private static final Log LOG = LogFactory.getLog(CursoServiceImpl.class);
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJPARepository cursoJpaRepository;
	
	@Override
	public List<Curso> listAllCurso() {
		// TODO Auto-generated method stub
		LOG.info("Llamada:" + "listAllCurso()");
		return cursoJpaRepository.findAll();
	}
	@Override
	public Curso addCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoJpaRepository.save(curso);
	}
	@Override
	public int removeCurso(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Curso updateCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoJpaRepository.save(curso);
	}
}
