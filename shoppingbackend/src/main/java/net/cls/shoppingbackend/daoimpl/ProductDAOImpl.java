package net.cls.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.cls.shoppingbackend.dao.ProductDAO;
import net.cls.shoppingbackend.dto.Category;
import net.cls.shoppingbackend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Product get(int productId) {
		try {
			
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			//return false;
		}
		return null;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("From Product", Product.class).getResultList();
	}

	@Override
	public boolean add(Product product) {
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			//return false;
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			//return false;
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			//call th  update method
			return this.update(product);
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			//return false;
		}
		return false;
	}

	@Override
	public List<Product> listActiveProducts() {
		String selectAtiveProducts="FROM Product WHERE active = :active";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selectAtiveProducts,Product.class);
		
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectAtiveProductsByCategory="FROM Product WHERE active = :active and categoryId = :categoryId";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selectAtiveProductsByCategory,Product.class);
		
		query.setParameter("active", true);
		query.setParameter("categoryId", categoryId);
		return query.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		String selectLatestActiveProducts="FROM Product WHERE active = :active ORDER BY id";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selectLatestActiveProducts,Product.class);
		
		
		return query.setParameter("active", true).setFirstResult(0).setMaxResults(count).getResultList();
	}

}
