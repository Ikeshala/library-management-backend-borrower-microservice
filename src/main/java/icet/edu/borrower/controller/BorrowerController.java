package icet.edu.borrower.controller;

import icet.edu.borrower.dto.Borrower;
import icet.edu.borrower.entity.BorrowerEntity;
import icet.edu.borrower.service.BorrowerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/borrower")
@RequiredArgsConstructor
public class BorrowerController {
    final BorrowerService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }
    @GetMapping("/get")
    public Iterable<BorrowerEntity> getBorrowers(){
        return service.getBorrowers();
    }
}
