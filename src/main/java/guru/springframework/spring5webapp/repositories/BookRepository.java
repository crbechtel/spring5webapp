package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @created 07/07/2020 - 9:51 PM
 * @project spring5webapp
 * @author  cliffordbechtel
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
