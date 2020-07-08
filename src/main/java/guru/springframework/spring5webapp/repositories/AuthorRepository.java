package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @created 07/07/2020 - 9:49 PM
 * @project spring5webapp
 * @author  cliffordbechtel
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
