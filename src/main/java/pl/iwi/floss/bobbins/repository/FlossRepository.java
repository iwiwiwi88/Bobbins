package pl.iwi.floss.bobbins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.iwi.floss.bobbins.model.Floss;

@Repository
public interface FlossRepository extends JpaRepository<Floss, Long> {
}
