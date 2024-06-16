package com.sunbeam.tester;

import java.util.Scanner;
import static com.sunbeam.utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;

import com.sunbeam.dao.ProductDao;
import com.sunbeam.dao.ProductDaoImpl;
import com.sunbeam.entities.Category;
import com.sunbeam.entities.Product;

public class AddProperty {

	public static void main(String[] args) {

		try(SessionFactory sf = getFactory();
				Scanner sc = new Scanner(System.in)
						){
			ProductDao prodDao = new ProductDaoImpl();
			System.out.println("Enter Product details - Category, Product Name, \r\n"
					+ "			 Price\r\n"
					+ "			Quantity");	
			Product nP = new Product(Category.valueOf(sc.next().toUpperCase()), sc.next(), sc.nextDouble(), sc.nextInt());
			
			System.out.println(prodDao.addProperty(nP));

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
