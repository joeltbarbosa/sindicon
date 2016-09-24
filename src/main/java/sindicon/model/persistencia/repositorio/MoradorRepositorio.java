package sindicon.model.persistencia.repositorio;

import org.springframework.data.repository.CrudRepository;
import sindicon.model.persistencia.entidade.Morador;

/**
 * Created by Thiago on 24/09/2016.
 */
public interface MoradorRepositorio extends CrudRepository<Morador, Integer> {

}