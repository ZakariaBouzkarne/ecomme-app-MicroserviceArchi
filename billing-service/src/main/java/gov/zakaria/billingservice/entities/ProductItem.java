package gov.zakaria.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill; // Many product items can be associated with one bill

    private int quantity;
    private double unitPrice;

    @Transient
    private Product product;

}
