package com.groupeisi.companyspringboot.controller;

import com.groupeisi.companyspringboot.dto.PurchaseDto;
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
@RequestMapping("/purchases")
public class PurchaseController {

    private final Logger logger = LoggerFactory.getLogger(PurchaseController.class);
    @GetMapping(value = "/all")
    public String all(Model model) {
        model.addAttribute("purchase", new PurchaseDto());
        return "purchases/all";
    }
    @PostMapping(value = "/save")
    public String save(@ModelAttribute("purchase") PurchaseDto purchase) {
        logger.info("reference du produit : {}, quantité du produit : {}", purchase.getProduct(), purchase.getQuantity());
        return "purchases/all";
    }
}
