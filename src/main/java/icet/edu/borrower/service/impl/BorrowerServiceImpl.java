package icet.edu.borrower.service.impl;

import icet.edu.borrower.dto.Borrower;
import icet.edu.borrower.entity.BorrowerEntity;
import icet.edu.borrower.repository.BorrowerRepository;
import icet.edu.borrower.service.BorrowerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BorrowerServiceImpl implements BorrowerService {
    final BorrowerRepository repository;
    ModelMapper mapper;
    @Bean
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
}
