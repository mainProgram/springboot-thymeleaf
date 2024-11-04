package com.groupeisi.companyspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class ProductEntity implements Serializable {
    @Id
    private String ref;

    private String name;

    private double stock;

    @OneToMany(mappedBy = "product")
    private List<PurchaseEntity> purchases;

    @OneToMany(mappedBy = "product")
    private List<SaleEntity> sales;
}