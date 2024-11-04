package com.groupeisi.companyspringboot.controller;

import com.groupeisi.companyspringboot.dto.SaleDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/sales")
public class SaleController {

    private final Logger logger = LoggerFactory.getLogger(SaleController.class);
    @GetMapping(value = "/all")
    public String all(Model model) {
        model.addAttribute("sale", new SaleDto());
        return "sales/all";
    }
    @PostMapping(value = "/save")
    public String save(@ModelAttribute("sale") SaleDto sale) {
        logger.info("reference du produit : {}, quantité du produit : {}", sale.getProduct(), sale.getQuantity());
        return "sales/all";
    }
}
