package gov.zakaria.inventoryservice.repository;

import gov.zakaria.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface productRepository extends JpaRepository<Product, String> {
    // Additional query methods can be defined here if needed
}
