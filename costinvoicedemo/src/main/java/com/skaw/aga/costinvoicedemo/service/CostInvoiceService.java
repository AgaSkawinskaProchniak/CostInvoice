package com.skaw.aga.costinvoicedemo.service;

import java.util.List;

import com.skaw.aga.costinvoicedemo.entity.CostInvoice;

public interface CostInvoiceService {

	public List<CostInvoice> findAll();
	public CostInvoice findById(int theId);
	public CostInvoice findByNo(String theInvoiceNo);
	public void save(CostInvoice theCostInvoice);
	public void deleteById(int theId);
	
	
}
