package pl.iwi.floss.bobbins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.iwi.floss.bobbins.model.Bobbin;

@Repository
public interface BobbinRepository extends JpaRepository<Bobbin, Long> {
}
