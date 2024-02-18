package icet.edu.borrower.repository;

import icet.edu.borrower.entity.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<BorrowerEntity, Long> {
}
