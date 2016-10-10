package sindcon.model.persistencia.repositorio;

import org.springframework.data.repository.CrudRepository;
import sindcon.model.persistencia.entidade.Endereco;

/**
 * Created by Thiago on 24/09/2016.
 */
public interface EnderecoRepositorio extends CrudRepository<Endereco, Integer> {

}