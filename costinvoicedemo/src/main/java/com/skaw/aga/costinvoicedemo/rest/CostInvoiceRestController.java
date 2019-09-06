package com.skaw.aga.costinvoicedemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.skaw.aga.costinvoicedemo.entity.CostInvoice;
import com.skaw.aga.costinvoicedemo.service.CostInvoiceService;

@RestController
@RequestMapping("/api")
public class CostInvoiceRestController {
	
	private CostInvoiceService costInvoiceService;
	
	@Autowired
	public CostInvoiceRestController(CostInvoiceService theCostInvoiceService) {
		costInvoiceService = theCostInvoiceService;
	}
	
	//expose /costInvoice and return list of invoices
	@GetMapping("/costinvoices")
	public List<CostInvoice> findAll(){
		return costInvoiceService.findAll();
	}

}
