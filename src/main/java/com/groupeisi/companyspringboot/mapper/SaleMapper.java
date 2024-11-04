package com.groupeisi.companyspringboot.mapper;

import com.groupeisi.companyspringboot.dto.ProductDto;
import com.groupeisi.companyspringboot.dto.SaleDto;
import com.groupeisi.companyspringboot.entity.ProductEntity;
import com.groupeisi.companyspringboot.entity.SaleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SaleMapper {

    SaleEntity toSaleEntity(SaleDto saleDto);

    SaleDto toSaleDto(SaleEntity saleEntity);

    List<SaleDto> toListSaleDto(List<SaleEntity> saleEntities);
}