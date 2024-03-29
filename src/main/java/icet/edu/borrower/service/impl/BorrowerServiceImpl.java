package icet.edu.borrower.service.impl;

import icet.edu.borrower.dto.Borrower;
import icet.edu.borrower.entity.BorrowerEntity;
import icet.edu.borrower.repository.BorrowerRepository;
import icet.edu.borrower.service.BorrowerService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    final BorrowerRepository repository;
    ModelMapper mapper;
    @PostConstruct
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addBorrower(Borrower borrower) {
        BorrowerEntity entity = mapper.map(borrower, BorrowerEntity.class);
        repository.save(entity);
    }

    @Override
    public Iterable<BorrowerEntity> getBorrowers() {
        return repository.findAll();
    }

    @Override
    public boolean deleteBorrower(Long bid) {
        if (repository.existsById(bid)) {
            repository.deleteById(bid);
            return true;
        }else { return false;}
    }

    @Override
    public Borrower getBorrowerId(Long bid) {
        Optional<BorrowerEntity> byId = repository.findById(bid);
        return mapper.map(byId, Borrower.class);
    }
}
