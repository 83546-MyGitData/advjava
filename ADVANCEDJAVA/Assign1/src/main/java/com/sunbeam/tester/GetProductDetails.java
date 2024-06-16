package com.sunbeam.tester;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;

public class GetProductDetails {

	public static void main(String[] args) {

		try(SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)){
			ProductDao prodDao = new ProductDaoImpl();
			System.out.println("Enter Product ID: ");
			System.out.println(prodDao.getProductDetailsById(sc.nextLong()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
