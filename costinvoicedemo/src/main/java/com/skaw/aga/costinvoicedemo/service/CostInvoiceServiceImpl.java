package com.skaw.aga.costinvoicedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.skaw.aga.costinvoicedemo.dao.CostInvoiceDAO;
import com.skaw.aga.costinvoicedemo.entity.CostInvoice;

public class CostInvoiceServiceImpl implements CostInvoiceService {
	
	private CostInvoiceDAO costInvoiceDAO;
	
	@Autowired
	public CostInvoiceServiceImpl (CostInvoiceDAO theCostInvoiceDAO) {
		costInvoiceDAO = theCostInvoiceDAO;
	}

	@Override
	@Transactional
	public List<CostInvoice> findAll() {
		return costInvoiceDAO.findAll();
	}

	@Override
	@Transactional
	public CostInvoice findById(int theId) {
		return costInvoiceDAO.findById(theId);
	}

	@Override
	@Transactional
	public CostInvoice findByNo(String theInvoiceNo) {
		return costInvoiceDAO.findByNo(theInvoiceNo);
	}

	@Override
	@Transactional
	public void save(CostInvoice theCostInvoice) {
		costInvoiceDAO.save(theCostInvoice);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		costInvoiceDAO.deleteById(theId);

	}

}
