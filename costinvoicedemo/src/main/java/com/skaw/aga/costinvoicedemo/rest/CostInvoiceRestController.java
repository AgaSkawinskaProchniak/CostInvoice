package com.skaw.aga.costinvoicedemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skaw.aga.costinvoicedemo.dao.CostInvoiceDAO;
import com.skaw.aga.costinvoicedemo.entity.CostInvoice;

@RestController
@RequestMapping("/api")
public class CostInvoiceRestController {
	
	private CostInvoiceDAO costInvoiceDAO;
	//fuj i blee but quick: inject dao
	
	public CostInvoiceRestController(CostInvoiceDAO theCostInvoiceDAO) {
		costInvoiceDAO = theCostInvoiceDAO;
	}
	
	//expose /costInvoice and return list of invoices
	@GetMapping("/costinvoices")
	public List<CostInvoice> findAll(){
		return costInvoiceDAO.findAll();
	}

}
