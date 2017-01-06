package com.todo.item;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.todo.item.Item;
@Repository
public class ItemDAO {
//	 @Autowired
//	 private SessionFactory sessionFactory ;
	
	@Autowired
	 HibernateTemplate template; 
//	 public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public List<Item> getItems() {
		
		System.out.println("Getting Items");
		 List<Item> itemList = template.loadAll(Item.class);
//		 Session session = this.sessionFactory.openSession();
//		 List<Item> itemList = session.createQuery("from Item").list();
//	        for(Item p : itemList){
//	        	System.out.println("Item:" + p.getName());
////	            logger.info("Person List::"+p);
//	        }
	        return itemList;
	 }

	 @Transactional(readOnly=false)
	 public Item addItem(Item item) {
//		 Session session = this.sessionFactory.getCurrentSession();
//		 session.persist(item);
		 template.save(item);  
		 return item;
	 }

	@Transactional(readOnly=false)
	public Item editItem(Item item) {
		template.saveOrUpdate(item);  
	   return item;
	}
}	
