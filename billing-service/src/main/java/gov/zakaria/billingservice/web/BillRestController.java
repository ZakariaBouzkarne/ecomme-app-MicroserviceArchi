package gov.zakaria.billingservice.web;

import gov.zakaria.billingservice.entities.Bill;
import gov.zakaria.billingservice.fein.CustomerRestClient;
import gov.zakaria.billingservice.fein.ProductRestClient;
import gov.zakaria.billingservice.repository.BillRepository;
import gov.zakaria.billingservice.repository.ProductItemRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController @AllArgsConstructor
public class BillRestController
{
    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    private ProductRestClient productRestClient;

    @GetMapping(path = "/bills/{id}")
    public Bill getBill(@PathVariable("id") Long id)
    {
        Bill bill = billRepository.findById(id).get();
        return bill;
    }
}
