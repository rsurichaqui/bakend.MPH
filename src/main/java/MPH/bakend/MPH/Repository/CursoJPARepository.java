package MPH.bakend.MPH.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MPH.bakend.MPH.Entity.Curso;

@Repository("cursoJpaRepository")
public interface CursoJPARepository extends JpaRepository<Curso,Long>{
	public abstract Curso findByPrecio(int precio);
	public abstract Curso findByPrecioAndNombre(int price, String name);
	public abstract List<Curso> findByNombreOrderByHoras(String nombre);
}