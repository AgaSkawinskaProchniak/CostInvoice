package com.skaw.aga.costinvoicedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cost_invoice")
public class CostInvoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="seller")
	private String seller;
	
	@Column(name="invoice_no")
	private String invoiceNo;
	
	@Column(name="netto")
	private double netto;
	
	@Column(name="vat")
	private double vat;
	
	@Column(name="month")
	private int month;
	
	@Column(name="year")
	private int year;
	
	public CostInvoice() {
		
	}
	
	
	public CostInvoice(String seller, String invoiceNo, double netto, double vat, int month, int year) {
		this.seller = seller;
		this.invoiceNo = invoiceNo;
		this.netto = netto;
		this.vat = vat;
		this.month = month;
		this.year = year;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public double getNetto() {
		return netto;
	}

	public void setNetto(double netto) {
		this.netto = netto;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	@Override
	public String toString() {
		return "CostInvoice [id=" + id + ", seller=" + seller + ", invoiceNo=" + invoiceNo + ", netto=" + netto
				+ ", vat=" + vat + ", month=" + month + ", year=" + year + "]";
	}
	

}
