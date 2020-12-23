package MPH.bakend.MPH.Service;

import java.util.List;

import MPH.bakend.MPH.Entity.*;

public interface CursoService {
	public abstract List<Curso> listAllCurso();
	public abstract Curso addCurso(Curso curso);
	public abstract int removeCurso(int id);
	public abstract Curso updateCurso(Curso curso);
}
