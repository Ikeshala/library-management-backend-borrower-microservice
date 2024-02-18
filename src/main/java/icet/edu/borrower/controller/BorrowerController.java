package icet.edu.borrower.controller;

import icet.edu.borrower.dto.Borrower;
import icet.edu.borrower.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {
    @Autowired
    BorrowerService service;
    @PostMapping
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }
}
