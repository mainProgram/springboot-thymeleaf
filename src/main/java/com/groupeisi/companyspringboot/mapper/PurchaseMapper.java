package com.groupeisi.companyspringboot.mapper;

import com.groupeisi.companyspringboot.dto.PurchaseDto;
import com.groupeisi.companyspringboot.entity.PurchaseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PurchaseMapper {

    PurchaseEntity toPurchaseEntity(PurchaseDto purchaseDto);

    PurchaseDto toPurchaseDto(PurchaseEntity purchaseEntity);

    List<PurchaseDto> toListPurchaseDto(List<PurchaseEntity> purchaseEntities);
}