package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kazahaya, Fábio on 8/18/23.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
