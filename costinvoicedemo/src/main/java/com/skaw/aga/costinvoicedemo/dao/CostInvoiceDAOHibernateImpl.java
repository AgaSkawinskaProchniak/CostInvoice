package com.skaw.aga.costinvoicedemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skaw.aga.costinvoicedemo.entity.CostInvoice;


@Repository
public class CostInvoiceDAOHibernateImpl implements CostInvoiceDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public CostInvoiceDAOHibernateImpl (EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<CostInvoice> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<CostInvoice> theQuery = 
				currentSession.createQuery("from CostInvoice", CostInvoice.class);
		
		List<CostInvoice> costInvoices = theQuery.getResultList();
		
		return costInvoices;
				
	}


	@Override
	public CostInvoice findById(int theId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		CostInvoice theCostInvoice = currentSession.get(CostInvoice.class, theId);
				
		return theCostInvoice;
	}

	@Override
	public CostInvoice findByNo(String theInvoiceNo) {
		

		Session currentSession = entityManager.unwrap(Session.class);
		
		CostInvoice theCostInvoice = currentSession.get(CostInvoice.class, theInvoiceNo);
				
		
		return theCostInvoice;
	}




	@Override
	public void save(CostInvoice theCostInvoice) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theCostInvoice);
		
	}




	@Override
	public void deleteById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery = currentSession.createQuery("delete from CostInvoice where id=:costInvoiceID");
		theQuery.setParameter("costInvoiceId", theId);
		theQuery.executeUpdate();
		
	}

}
