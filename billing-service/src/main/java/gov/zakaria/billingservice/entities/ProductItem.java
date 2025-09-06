package gov.zakaria.billingservice.entities;

import gov.zakaria.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter
@Setter @Builder
public class ProductItem
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;

    @ManyToOne
    private Bill bill; // Many product items can be associated with one bill

    private int quantity;
    private double unitPrice;

    @Transient
    private Product product;

}
