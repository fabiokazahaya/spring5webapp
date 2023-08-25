package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Kazahaya, Fábio on 8/18/23.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
