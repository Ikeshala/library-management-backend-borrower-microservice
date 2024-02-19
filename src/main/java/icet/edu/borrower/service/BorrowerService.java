package icet.edu.borrower.service;

import icet.edu.borrower.dto.Borrower;
import icet.edu.borrower.entity.BorrowerEntity;

public interface BorrowerService {
    void addBorrower(Borrower borrower);
    Iterable<BorrowerEntity> getBorrowers();
}
