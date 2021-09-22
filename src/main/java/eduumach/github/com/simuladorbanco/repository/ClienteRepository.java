package eduumach.github.com.simuladorbanco.repository;

import eduumach.github.com.simuladorbanco.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}
