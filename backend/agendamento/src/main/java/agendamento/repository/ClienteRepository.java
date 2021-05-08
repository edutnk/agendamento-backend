package agendamento.repository;

import agendamento.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

}
