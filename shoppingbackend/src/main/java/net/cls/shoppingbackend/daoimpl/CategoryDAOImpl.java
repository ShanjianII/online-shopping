package net.cls.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.cls.shoppingbackend.dao.CategoryDAO;
import net.cls.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		
		String selectAtiveCategory="FROM Category WHERE active = :active";
		
		Query query=sessionFactory.getCurrentSession().createQuery(selectAtiveCategory);
		
		query.setParameter("active", true);
		return query.getResultList();
	}


	@Override
	
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().persist(category);
			return true;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
		
		
	}

	/*
	 * 
	 * Getting single category based on id
	 * @see net.cls.shoppingbackend.dao.CategoryDAO#get(int)
	 */
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	//Updating a single category
	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
				try {
					// add the category to the database table
					
					sessionFactory.getCurrentSession().update(category);
					return true;
				} catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
					return false;
				}
	}


	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
	}

}
