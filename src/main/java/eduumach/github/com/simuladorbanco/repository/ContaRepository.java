package eduumach.github.com.simuladorbanco.repository;

import eduumach.github.com.simuladorbanco.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {

}
