package gov.zakaria.billingservice.repository;

import gov.zakaria.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}
