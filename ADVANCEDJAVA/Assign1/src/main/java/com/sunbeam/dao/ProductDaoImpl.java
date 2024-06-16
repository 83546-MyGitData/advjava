package com.sunbeam.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.sunbeam.entities.Product;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import java.io.Serializable;


public class ProductDaoImpl implements ProductDao {

	@Override
	public String addProperty(Product product) {
		String msg = "Product addition failed!!!";
		Session session=getFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		try {
			Serializable productId = session.save(product);
			tx.commit();
			msg="Product added successfully with productID "+productId;
		} catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

	@Override
	public Product getProductDetailsById(Long prodID) {
		Product product = null;
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		try {
			product=session.get(Product.class, prodID);
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return product;
	}


	
	
}
