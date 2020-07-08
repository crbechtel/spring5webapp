package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author cliffordbechtel
 * @created 07/07/2020 - 10:21 PM
 * @project spring5webapp
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
